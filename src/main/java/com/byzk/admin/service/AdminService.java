package com.byzk.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.byzk.admin.dao.AdminDao;
import com.byzk.admin.dto.Admin;
import com.byzk.admin.dto.AdminResult;

@Service
@Transactional
public class AdminService {
	
	@Autowired
	public AdminDao adminDao ; 
	
	public AdminResult loginAdmin(Admin admin){
		System.out.println(admin.getTd_name());
		System.out.println(admin.getTd_pwd());
		//创建一个AdminResult用于保存管理员登录信息
		AdminResult result = new AdminResult();
		//通过用户名查询管理员信息
		Admin ad = adminDao.findAdmin(admin.getTd_name());
		System.out.println(ad);
		//对管理员信息做判断
		if(ad == null){
			result.setStatus(1);
			result.setMsg("用户不存在!");
			return result ;
		}
		if(!ad.getTd_pwd().equals(admin.getTd_pwd())){
			result.setStatus(2);
			result.setMsg("密码错误!");
			return result ; 
		}
		result.setStatus(0);
		result.setMsg("登录成功!");
		result.setData(ad);
		return result;	
	}
	
	public AdminResult addAdminService(Admin admin){
		AdminResult result = new AdminResult() ; 
		Admin ad = adminDao.findAdmin(admin.getTd_name()) ;
		if(ad != null){
			result.setStatus(1);
			result.setMsg("用户名以存在!");
			return result ; 
		}
		int num = adminDao.addAdmin(admin);
		if(num >=0 ){
			result.setStatus(0);
			result.setMsg("添加用户成功!");
			return result ; 
		}
		result.setStatus(2);
		result.setMsg("添加用户失败!");
		return result;	
	}

	public AdminResult findAll(){
		AdminResult result = new AdminResult() ; 
		List<Admin> list = adminDao.findAllAdmin();
		System.out.println(list);
		if(list == null){
			result.setStatus(1);
			result.setMsg("用户加载失败!");
			return result ;
		}
		result.setStatus(0);
		result.setMsg("加载成功!");
		result.setData(list);
		return result;	
	}
	
	public Integer deleteAdmin(Integer id){
		Integer num = adminDao.deleteAdminById(id);
		return num;
	}
	
}
