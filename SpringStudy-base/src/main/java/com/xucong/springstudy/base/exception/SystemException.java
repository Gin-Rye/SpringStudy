package com.xucong.springstudy.base.exception;

public class SystemException extends RuntimeException {

	private static final long serialVersionUID = 6221309000269255619L;

	public SystemException() {
		super();
	}
	
	public SystemException(String message) {
		super(message);
	}
}
