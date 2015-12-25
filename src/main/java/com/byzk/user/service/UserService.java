package com.byzk.user.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.byzk.admin.dto.Admin;
import com.byzk.user.dao.UserDao;
import com.byzk.user.dto.Book;
import com.byzk.user.dto.BookResult;
import com.byzk.user.dto.Reade;
import com.byzk.user.dto.UserResult;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserDao userDao ;
	
	public UserResult findReaderService(){
		UserResult result = new UserResult() ; 
		List<Reade> list = userDao.findAll() ;
		result.setData(list);
		return result;
	}
	
	public BookResult findBookService(String name){
		System.out.println(name);
		BookResult result = new BookResult();
		Book book = userDao.findBooks(name);
		System.out.println(book);
		if(book == null){
			result.setStrues(1);
			result.setMsg("没有库存!");
			return result ; 
		}
		result.setData(book);
		System.out.println(result);
		return result;
		
	}
	
	public UserResult findReaderService(Reade re){
		UserResult result = new UserResult() ; 
		Reade read = userDao.findReader(re.getName());
		if(read == null){
			result.setStrues(1);
			result.setMsg("读者不存在!");
			return result ; 
		}
		if(!read.getSex().equals(re.getSex())){
			result.setStrues(2);
			result.setMsg("性别错误!");
			return result ; 
		}
		if(!read.getTel().equals(re.getTel())){
			result.setStrues(3);
			result.setMsg("登记电话错误!");
			return result ; 
		}
		result.setStrues(0);
		result.setMsg("验证成功!");
		result.setData(read);
		return result;
		
	}
	
	
	public UserResult addReaderService(Reade reade){
		UserResult result = new UserResult() ;
		Date date = new Date() ; 
		reade.setCreatedate(date);
		int num = userDao.addReader(reade);
		if(num >= 0){
			result.setStrues(0);
			result.setMsg("添加读者成功!");
			return result ;
		}
		result.setStrues(1);
		result.setMsg("添加读者失败!");
		return result;
		
	}
	
	public BookResult findBookService(){
		BookResult result = new BookResult();
		List<Book> list = userDao.findBook();
		if(list == null){
			result.setStrues(1);
			result.setMsg("加载失败!");
			return result ;
		}
		result.setStrues(0);
		result.setMsg("加载成功!");
		result.setData(list);
		return result;
	}
	
	public UserResult findUserService(Admin admin){
		UserResult result = new UserResult();
		Admin ad= userDao.findUser(admin.getTd_name());
		if(ad == null){
			result.setStrues(1);
			result.setMsg("用户不存在!");
			return result ;
		}
		if(!ad.getTd_pwd().equals(admin.getTd_pwd())){
			result.setStrues(2);
			result.setMsg("密码错误!");
			return result ; 
		};
		result.setStrues(0);
		result.setMsg("登录成功!");
		return result;	
	}
	
	public UserResult addBookService(Book book){
		UserResult result = new UserResult();
		//获取系统当前时间
		Date date = new Date();
		book.setInTime(date);
		System.out.println(book);
		int num = userDao.addBook(book);
		if(num >= 0){
			result.setStrues(0);
			result.setMsg("添加成功!");
			return result ;
		}
		result.setStrues(1);
		result.setMsg("添加失败!");
		return result;
	}
	//生存验证码。

}
