package com.byzk.user.dto;

import java.util.Date;

public class Reade {
	private Integer id ;
	private String name ; 
	private Character sex;
	private String tel ;
	private Date createdate ; 
	private Integer borrownum ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Integer getBorrownum() {
		return borrownum;
	}
	public void setBorrownum(Integer borrownum) {
		this.borrownum = borrownum;
	}
	@Override
	public String toString() {
		return "Reade [id=" + id + ", name=" + name + ", sex=" + sex + ", tel=" + tel + ", createdate=" + createdate
				+ ", borrownum=" + borrownum + "]";
	}
	

}
