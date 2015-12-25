package com.byzk.book.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.byzk.book.dao.BorrowAndBackDao;
import com.byzk.book.dto.BorrowAndBack;
import com.byzk.book.dto.Result;
import com.byzk.user.dao.UserDao;
import com.byzk.user.dto.UserResult;

@Service
@Transactional
public class BorrowAndBackService {
	
	@Autowired
	private BorrowAndBackDao borrowAndBackDao;
	@Autowired
	private UserDao userDao ;
	
	public UserResult findBorrowService(String name){
		UserResult result = new UserResult();
		List<BorrowAndBack> list = borrowAndBackDao.findBorrowByName(name);
		result.setData(list);
		return result;
		
	}
	
	
	public Result borrowBook(BorrowAndBack borrowAndBack){
		Result result = new Result() ;
		Date date = new Date();
		borrowAndBack.setBorrowtime(date);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(c.MONTH, 3);
		Date bockDate = c.getTime();
		borrowAndBack.setYgbacktime(bockDate);
		borrowAndBack.setIsback('否');
		System.out.println();
		System.out.println(borrowAndBack.getReadid()+" "+borrowAndBack.getBookname()+" "+borrowAndBack.getBorrowtime()+" "+borrowAndBack.getYgbacktime()+
				" "+borrowAndBack.getIsback());
		int num = borrowAndBackDao.borrowBook(borrowAndBack);
		boolean flag = false ;
		if(num >= 0){
			userDao.updateBookByName(borrowAndBack.getBookname());
			userDao.updateUserById(borrowAndBack.getReadid());
			flag = true ; 
		}
		if(flag){
			result.setStatus(0);
			result.setMsg("借阅成功!");
			return result ; 
		}
		result.setStatus(1);
		result.setMsg("借阅失败!");
		return null;
	}

}
