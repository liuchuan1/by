package com.byzk.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.byzk.book.dto.BorrowAndBack;
import com.byzk.book.dto.Result;
import com.byzk.book.service.BorrowAndBackService;
import com.byzk.user.dto.UserResult;

@Controller
public class BorrowAndBackController {
	
	@Autowired
	private BorrowAndBackService borrowAndBackService ;
	
	
	@RequestMapping("/borrow")
	@ResponseBody
	public Result borrowBook(@ModelAttribute BorrowAndBack borrowAndBack){
		System.out.println(borrowAndBack.getReadid()+" "+ borrowAndBack.getBookname());
		Result result = borrowAndBackService.borrowBook(borrowAndBack);
		return result;
		
	}

}
