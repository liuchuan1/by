package com.byzk.user.dao;

import java.io.Reader;
import java.util.List;

import com.byzk.admin.dto.Admin;
import com.byzk.user.dto.Book;
import com.byzk.user.dto.Reade;

public interface UserDao {
	public Admin findUser(String name);
	
	public int addBook(Book book);
	
	public List<Book> findBook() ;
	
	public int addReader(Reade reade);
	
	public Reade findReader(String name);
	
	public Book findBooks(String name) ;
	
	public int updateBookByName(String name);
	
	public int updateUserById(Integer id);
	
	public List<Reade> findAll() ; 

}
