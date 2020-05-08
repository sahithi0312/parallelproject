package com.capgemini.librarymanagementsystem_hibernate.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_hibernate.dao.StudentDAO;
import com.capgemini.librarymanagementsystem_hibernate.dto.BorrowedBooksBean;
import com.capgemini.librarymanagementsystem_hibernate.factory.LibraryFactory;

public class StudentServiceImplement implements StudentService{
	
	private StudentDAO dao = LibraryFactory.getStudentDao();

	@Override
	public List<BorrowedBooksBean> borrowedBook(int uId) {
		// TODO Auto-generated method stub
		return dao.borrowedBook(uId);
	}

	@Override
	public boolean request(int uId, int bId) {
		// TODO Auto-generated method stub
		return dao.request(uId, bId);
	}

	@Override
	public boolean returnBook(int bId, int uId, String status) {
		// TODO Auto-generated method stub
		return dao.returnBook(bId, uId, status);
	}

}
