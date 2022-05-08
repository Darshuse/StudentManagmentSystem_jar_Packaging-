package com.boubyan.me.Student_Managment_System.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentCoursNotFoundException extends RuntimeException {

	public StudentCoursNotFoundException(String message) {
		super(message);
	}
}
