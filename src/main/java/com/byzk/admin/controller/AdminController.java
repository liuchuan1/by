package com.byzk.admin.controller;

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
import com.byzk.admin.dto.AdminResult;
import com.byzk.admin.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService ;
	/*
	 * 通过管理员id删除管理员，并重定向到管理员查询页面
	 */
	@RequestMapping("/logindel")
	public String deleteAdminController(@RequestParam Integer id){
		adminService.deleteAdmin(id);
		return "redirect:loginfindAllAdmin";
	}
	/*
	 * 查询所有管理员，并将查询出来的信息绑定到视图上，返回到adminView视图上
	 */
	@RequestMapping("/loginfindAllAdmin")
	public String findAllAdm(Model model){
		AdminResult result = adminService.findAll();
		model.addAttribute("status", result.getStatus());
		model.addAttribute("msg", result.getMsg());
		model.addAttribute("data", result.getData());
		return "adminView";	
	}
	
	/*
	 * 生存一个管理员管理页面
	 */
	@RequestMapping(value="/loginadmin",method=RequestMethod.GET)
	public ModelAndView adminView(ModelAndView model){
		return new ModelAndView("adminView");	
	}
	
	/*
	 * 管理员添加
	 */
	@RequestMapping("/loginadd")
	@ResponseBody
	public AdminResult add(@ModelAttribute Admin admin){
		System.out.println(admin);
		AdminResult result = adminService.addAdminService(admin);
		return result;
	}
	
	/*
	 * 系统管理员登录检查，并将登录信息保存到session中，将登录信息结果以json数据格式返回给页面！
	 */
	@RequestMapping(value="/logi")
	@ResponseBody
	public AdminResult login(@ModelAttribute Admin admin ,HttpServletRequest request){
		System.out.println(admin);
		AdminResult result = adminService.loginAdmin(admin);
		//输出请求路径
		System.out.println(request.getRequestURI());
		//将登录信息保存到session中
		request.getSession().setAttribute("res", result.getData());
		//设置session保存时间
		request.getSession().setMaxInactiveInterval(3);
		//获取session中保存的数据
		request.getSession().getAttribute("res");
		//输出session中保存的数据
		System.out.println(request.getSession().getAttribute("res")+""+"liu");
		System.out.println(result);
		return result;
	}
	
	/*
	 * 生存一个系统管理员登录页面
	 */
	@RequestMapping(value="/log",method=RequestMethod.GET)
	public ModelAndView loginView(ModelAndView model){
		return new ModelAndView("login");	
	}

}
