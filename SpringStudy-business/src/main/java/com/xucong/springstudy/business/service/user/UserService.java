package com.xucong.springstudy.business.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xucong.springstudy.base.exception.BusinessException;
import com.xucong.springstudy.business.dao.user.UserDao;
import com.xucong.springstudy.domain.user.User;
import com.xucong.springstudy.util.MessageResourcesUtils;
import com.xucong.springstudy.util.StringUtils;
import com.xucong.springstudy.util.encrypt.AbstractTextEncryptor;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	private AbstractTextEncryptor textEncryptor;
	
	public User findByName(String name) {
		return userDao.findByName(name);
	}
	
	public void checkPassword(String password, User user) throws BusinessException {
		String ciphertextPassword = textEncryptor.encrypt(password);
		if(!StringUtils.equals(ciphertextPassword, user.getPassword())) {
			throw new BusinessException(MessageResourcesUtils.getMessage("user.password.unsame"));
		}
	}
}
