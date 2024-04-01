package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class Globalexception {

@ExceptionHandler (value=Namenotfoundexception.class) 
	public ResponseEntity<Object> Namenotfoundexceptionhandling(Namenotfoundexception d) {
	return new ResponseEntity<>(d.getMessage(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler (value=NullPointerException.class)
public ResponseEntity<Object>nullhandling(NullPointerException s) {  	
	return new ResponseEntity<>(s.getMessage(),HttpStatus.BAD_REQUEST);
	
}
}
