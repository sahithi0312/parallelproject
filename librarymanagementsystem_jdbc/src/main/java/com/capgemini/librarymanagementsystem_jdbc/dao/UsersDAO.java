package com.capgemini.librarymanagementsystem_jdbc.dao;

import java.util.List;

import com.capgemini.librarymanagementsystem_jdbc.dto.BookBean;
import com.capgemini.librarymanagementsystem_jdbc.dto.UsersBean;

public interface UsersDAO {
	boolean register(UsersBean user);
	UsersBean login(String email,String password);
	List<BookBean> searchBookById(int bId);
	List<BookBean> searchBookByTitle(String bookName);
	List<BookBean> searchBookByAuthor(String author);
	List<BookBean> getBooksInfo();
	boolean updatePassword(String email,String password,String newPassword,String role);
}
