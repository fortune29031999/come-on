package com.StudentDetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class Globlaexception {
@ExceptionHandler(value=Agenotfound.class)
public ResponseEntity<Object>globalexception(Agenotfound s){
	return new ResponseEntity<Object>(s.getMessage(),HttpStatus.BAD_REQUEST);
}
}
