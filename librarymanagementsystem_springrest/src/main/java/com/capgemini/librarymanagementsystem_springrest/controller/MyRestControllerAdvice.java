package com.capgemini.librarymanagementsystem_springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.librarymanagementsystem_springrest.dto.LmsResponse;
import com.capgemini.librarymanagementsystem_springrest.exception.LMSException;

@RestControllerAdvice
public class MyRestControllerAdvice {

	@ExceptionHandler
	public LmsResponse myExceptionHandler(LMSException lmsException) {
		LmsResponse response = new LmsResponse();
		response.setError(true);
		response.setMessage(lmsException.getMessage());
		return response;
	}
}
