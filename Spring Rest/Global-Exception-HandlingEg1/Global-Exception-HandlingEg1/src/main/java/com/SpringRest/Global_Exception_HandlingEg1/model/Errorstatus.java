package com.SpringRest.Global_Exception_HandlingEg1.model;

import java.time.LocalDateTime;

public class Errorstatus {

	private String status;
	private String message;
	private LocalDateTime when;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getWhen() {
		return when;
	}
	public void setWhen(LocalDateTime when) {
		this.when = when;
	}
	@Override
	public String toString() {
		return "errorpojo [status=" + status + ", message=" + message + ", when=" + when + "]";
	}
	public Errorstatus(String status, String message, LocalDateTime when) {
		super();
		this.status = status;
		this.message = message;
		this.when = when;
	}
	public Errorstatus() {
		super();
		// TODO Auto-generated constructor stub
	}
}
