package com.SpringRest.Global_Exception_HandlingEg1.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.SpringRest.Global_Exception_HandlingEg1.model.Errorstatus;

@RestControllerAdvice
public class GlobalExceptionHandling {
	
	@ExceptionHandler(IidNotFoundException.class)
	public ResponseEntity<Errorstatus> handlingId(IidNotFoundException e)
	{
		Errorstatus obj= new Errorstatus("404 not found",e.getMessage(),LocalDateTime.now());
		return new ResponseEntity<Errorstatus>(obj,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}

}
