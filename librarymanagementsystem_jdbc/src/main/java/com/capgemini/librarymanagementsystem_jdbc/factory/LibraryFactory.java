package com.capgemini.librarymanagementsystem_jdbc.factory;

import com.capgemini.librarymanagementsystem_jdbc.dao.AdminDAO;
import com.capgemini.librarymanagementsystem_jdbc.dao.AdminDAOImplement;
import com.capgemini.librarymanagementsystem_jdbc.dao.StudentDAO;
import com.capgemini.librarymanagementsystem_jdbc.dao.StudentDAOImplement;
import com.capgemini.librarymanagementsystem_jdbc.dao.UsersDAO;
import com.capgemini.librarymanagementsystem_jdbc.dao.UsersDAOImplement;
import com.capgemini.librarymanagementsystem_jdbc.service.AdminService;
import com.capgemini.librarymanagementsystem_jdbc.service.AdminServiceImplement;
import com.capgemini.librarymanagementsystem_jdbc.service.StudentService;
import com.capgemini.librarymanagementsystem_jdbc.service.StudentServiceImplement;
import com.capgemini.librarymanagementsystem_jdbc.service.UsersService;
import com.capgemini.librarymanagementsystem_jdbc.service.UsersServiceImplement;


public class LibraryFactory {
	public static UsersDAO getUsersDao() {
		return new UsersDAOImplement();
	}
	public static UsersService getUsersService() {
		return new UsersServiceImplement();
	}
	
	public static AdminDAO getAdminDao() {
		return new AdminDAOImplement();
	}
	public static AdminService getAdminService() {
		return new AdminServiceImplement();
	}
	
	public static StudentDAO getStudentDao() {
		return new StudentDAOImplement();
	}
	public static StudentService getStudentService() {
		return new StudentServiceImplement();
	}
}