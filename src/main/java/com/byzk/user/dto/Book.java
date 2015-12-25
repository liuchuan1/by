package com.byzk.user.dto;

import java.util.Date;

public class Book {
	private Integer bookcode;
	private String bookname;
	private String type;
	private String autor;
	private String translator;
	private String pubname;
	private Double price;
	private Integer page;
	private String bcase;
	private Integer storsge;
	private Date inTime;
	public Integer getBookcode() {
		return bookcode;
	}
	public void setBookcode(Integer bookcode) {
		this.bookcode = bookcode;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTranslator() {
		return translator;
	}
	public void setTranslator(String translator) {
		this.translator = translator;
	}
	public String getPubname() {
		return pubname;
	}
	public void setPubname(String pubname) {
		this.pubname = pubname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public String getBcase() {
		return bcase;
	}
	public void setBcase(String bcase) {
		this.bcase = bcase;
	}

	public Integer getStorsge() {
		return storsge;
	}
	public void setStorsge(Integer storsge) {
		this.storsge = storsge;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", bookname=" + bookname + ", type=" + type + ", autor=" + autor
				+ ", translator=" + translator + ", pubname=" + pubname + ", price=" + price + ", page=" + page
				+ ", bcase=" + bcase + ", storsge=" + storsge + ", inTime=" + inTime + "]";
	}
	

	


}
