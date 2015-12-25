package com.byzk.admin.dto;

public class Admin {
	private Integer id ;
	private String td_name ; 
	private String td_pwd ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTd_name() {
		return td_name;
	}
	public void setTd_name(String td_name) {
		this.td_name = td_name;
	}
	public String getTd_pwd() {
		return td_pwd;
	}
	public void setTd_pwd(String td_pwd) {
		this.td_pwd = td_pwd;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", td_name=" + td_name + ", td_pwd=" + td_pwd + "]";
	}
	
	

}
