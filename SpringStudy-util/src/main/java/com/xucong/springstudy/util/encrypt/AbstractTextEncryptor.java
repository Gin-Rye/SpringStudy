package com.xucong.springstudy.util.encrypt;

public abstract class AbstractTextEncryptor extends AbstractEncryptor<String> {
	
	@Override
	public abstract String encrypt(String message);
}
