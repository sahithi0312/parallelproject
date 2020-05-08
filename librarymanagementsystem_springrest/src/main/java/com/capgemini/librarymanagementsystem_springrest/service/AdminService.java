package com.capgemini.librarymanagementsystem_springrest.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_springrest.dto.BookBean;
import com.capgemini.librarymanagementsystem_springrest.dto.BookIssueBean;
import com.capgemini.librarymanagementsystem_springrest.dto.RequestDetailsBean;
import com.capgemini.librarymanagementsystem_springrest.dto.UsersBean;

public interface AdminService {
	boolean addBook(BookBean book);
	boolean removeBook(int bId);
	boolean updateBook(BookBean book);
	boolean issueBook(int bId,int uId);
	List<Integer> bookHistoryDetails(int uId);
	List<RequestDetailsBean> showRequests();
	List<BookIssueBean> showIssuedBooks();
	List<UsersBean> showUsers();

}
