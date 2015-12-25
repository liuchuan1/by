package com.byzk.book.dto;

import java.util.Date;

public class BorrowAndBack {
	private Integer id ;
	private Integer readid;
	private String bookname;
	private Date borrowtime;
	private Date ygbacktime;
	private Date sjbacktime;
	private String borrowoper;
	private String backoper;
	private char isback;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getReadid() {
		return readid;
	}
	public void setReadid(Integer readid) {
		this.readid = readid;
	}

	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Date getBorrowtime() {
		return borrowtime;
	}
	public void setBorrowtime(Date borrowtime) {
		this.borrowtime = borrowtime;
	}
	public Date getYgbacktime() {
		return ygbacktime;
	}
	public void setYgbacktime(Date ygbacktime) {
		this.ygbacktime = ygbacktime;
	}
	public Date getSjbacktime() {
		return sjbacktime;
	}
	public void setSjbacktime(Date sjbacktime) {
		this.sjbacktime = sjbacktime;
	}
	public String getBorrowoper() {
		return borrowoper;
	}
	public void setBorrowoper(String borrowoper) {
		this.borrowoper = borrowoper;
	}
	public String getBackoper() {
		return backoper;
	}
	public void setBackoper(String backoper) {
		this.backoper = backoper;
	}
	public char getIsback() {
		return isback;
	}
	public void setIsback(char isback) {
		this.isback = isback;
	}
	

}
