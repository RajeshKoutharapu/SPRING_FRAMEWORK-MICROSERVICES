package com.SpringRest.GlobalException_Handling.ExceptionHandling;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.SpringRest.GlobalException_Handling.Pojos.errorpojo;

@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler(IdnotFoundException.class)
	public ResponseEntity<errorpojo> IdnotFound(IdnotFoundException e) {
	errorpojo obj=new errorpojo("404 not found",e.getMessage(),LocalDateTime.now());
	return new  ResponseEntity<errorpojo>(obj,HttpStatus.NOT_FOUND);
		 
	}
}
