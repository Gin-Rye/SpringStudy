package com.xucong.springstudy.util.encrypt;

public abstract class AbstractEncryptor<T> {
	
	public abstract T encrypt(T message);
}
