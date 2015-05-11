package org.xucong.spring.business.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xucong.spring.business.dao.UserDao;
import org.xucong.spring.domain.User;

@Service
public class UserService {
	@Autowired
	public UserDao dao;
	
	@PostConstruct
	public void init() {
		
	}
	
	public List<User> queryAll() {
		return dao.queryAll();
	}
}
