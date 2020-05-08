package com.capgemini.librarymanagementsystem_jdbc.dao;

import java.util.List;

import com.capgemini.librarymanagementsystem_jdbc.dto.BorrowedBooks;

public interface StudentDAO {
	boolean request(int uId, int bId);
	List<BorrowedBooks> borrowedBook(int uId);
	boolean returnBook(int bId,int uId,String status);

}
