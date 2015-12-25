package com.byzk.admin.dao;

import java.util.List;

import com.byzk.admin.dto.Admin;

public interface AdminDao {
	
	public Admin findAdmin(String name);
	
	public int addAdmin(Admin admin);

	public List<Admin> findAllAdmin();
	
	public int deleteAdminById(Integer id);
}
