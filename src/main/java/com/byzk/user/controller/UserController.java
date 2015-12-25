package com.byzk.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.byzk.admin.dto.Admin;
import com.byzk.book.service.BorrowAndBackService;
import com.byzk.user.dto.Book;
import com.byzk.user.dto.BookResult;
import com.byzk.user.dto.Reade;
import com.byzk.user.dto.UserResult;
import com.byzk.user.service.UserService;
import com.byzk.user.util.Validate;

@Controller
public class UserController {

	@Autowired
	private UserService userService ;
	
	@Autowired
	private BorrowAndBackService borrowAndBackService ; 
	
	@RequestMapping(value="/findreaders")
	public String findReaderController(Model model){
		UserResult result = userService.findReaderService() ;
		model.addAttribute("data", result.getData()) ; 
		return "readers";
		
	}
	
	@RequestMapping("/findb")
	@ResponseBody
	public BookResult findBookController(@RequestParam String bookname){
		System.out.println(bookname);
		BookResult result = userService.findBookService(bookname);
		return result;
		
	}
	
	
	@RequestMapping("/findreader")
	public String findReaderController(Model model, Reade re){
		System.out.println(re);
		UserResult result = userService.findReaderService(re);
		String msg = "" ; 
		if(result.getStrues() == 1){
			msg = result.getMsg() ; 
			model.addAttribute("struse", result.getStrues());
			model.addAttribute("msg", msg) ; 
			return "readerlogin"; 
		}
		if(result.getStrues() == 2){
			msg = result.getMsg() ; 
			model.addAttribute("msg", msg) ; 
			return "readerlogin"; 
		}
		System.out.println(result);
		UserResult res = borrowAndBackService.findBorrowService(re.getName());
		model.addAttribute("data", result.getData());
		model.addAttribute("dat", res.getData());
		return "reader";
	}
	
	@RequestMapping("/addreader")
	@ResponseBody
	public UserResult addRearerController(Reade reade){
		UserResult result = userService.addReaderService(reade); 
		return result;
	}
	
	@RequestMapping("/findbook")
	public String findBookController(Model model){
		BookResult result = userService.findBookService();
		if(result.getStrues() == 1){
			model.addAttribute("msg", result.getMsg());
			return "error" ; 
		}
		model.addAttribute("msg", result.getMsg());
		model.addAttribute("data", result.getData());
		return "books";
		
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public UserResult addBookController(Book book){
		System.out.println(book);
		UserResult result = userService.addBookService(book);
		return result;
		
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public UserResult UserLoginController(@ModelAttribute Admin admin ,HttpServletRequest request){
		System.out.println(admin);
		UserResult result = userService.findUserService(admin) ; 
		request.getSession().setAttribute("usersession", result.getMsg());
		System.out.println(request.getSession().getAttribute("usersession+")+" "+"123456789");
		System.out.println(result);
		System.out.println(result.getStrues());
		System.out.println(result.getMsg());
		return result;	
	}
	
	@RequestMapping(value="/uesrlogin",method=RequestMethod.GET)
	public ModelAndView Userlogin(ModelAndView model){
		return new ModelAndView("userlogin");
	}
	
	@RequestMapping("/book")
	public String bookService(){
		return "book";	
	}
	
	@RequestMapping("/addbook")
	public String addbooks(){
		return "addbook";	
	}
	
	@RequestMapping("/read")
	public String read(){
		return "readerlogin";
	}
	@RequestMapping("/addread") 
	public String addRead(){
		return "addreader";	
	}
}
