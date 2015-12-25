package com.byzk.book.dao;

import java.util.List;

import com.byzk.book.dto.BorrowAndBack;

public interface BorrowAndBackDao {
	
	public int borrowBook(BorrowAndBack borrowAndBack);
	
	
	public List<BorrowAndBack> findBorrowByName(String name);
	

}
