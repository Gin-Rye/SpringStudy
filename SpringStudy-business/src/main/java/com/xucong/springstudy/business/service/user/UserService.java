package com.xucong.springstudy.business.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xucong.springstudy.business.dao.user.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
}
