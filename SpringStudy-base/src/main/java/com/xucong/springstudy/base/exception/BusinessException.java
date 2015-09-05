package com.xucong.springstudy.base.exception;

public class BusinessException extends Exception {

	private static final long serialVersionUID = 5061956407965856014L;

	public BusinessException() {
		super();
	}
	
	public BusinessException(String message) {
		super(message);
	}
}
