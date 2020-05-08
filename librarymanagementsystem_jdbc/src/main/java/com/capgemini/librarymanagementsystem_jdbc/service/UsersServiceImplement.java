package com.capgemini.librarymanagementsystem_jdbc.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_jdbc.dao.UsersDAO;
import com.capgemini.librarymanagementsystem_jdbc.dto.BookBean;
import com.capgemini.librarymanagementsystem_jdbc.dto.UsersBean;
import com.capgemini.librarymanagementsystem_jdbc.factory.LibraryFactory;

public class UsersServiceImplement implements UsersService{

	private UsersDAO dao = LibraryFactory.getUsersDao();

	@Override
	public boolean register(UsersBean user) {
		// TODO Auto-generated method stub
		return dao.register(user);
	}

	@Override
	public UsersBean login(String email, String password) {
		// TODO Auto-generated method stub
		return dao.login(email, password);
	}

	@Override
	public List<BookBean> searchBookById(int bId) {
		// TODO Auto-generated method stub
		return dao.searchBookById(bId);
	}

	@Override
	public List<BookBean> searchBookByTitle(String bookName) {
		// TODO Auto-generated method stub
		return dao.searchBookByTitle(bookName);
	}

	@Override
	public List<BookBean> searchBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.searchBookByAuthor(author);
	}

	@Override
	public List<BookBean> getBooksInfo() {
		// TODO Auto-generated method stub
		return dao.getBooksInfo();
	}

	@Override
	public boolean updatePassword(String email, String password, String newPassword, String role) {
		// TODO Auto-generated method stub
		return dao.updatePassword(email, password, newPassword, role);
	}
}
