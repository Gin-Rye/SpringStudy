package com.xucong.springstudy.business.dao.user;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import com.xucong.springstudy.domain.user.User;

@Test(testName = "userDaoTest")
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTest extends AbstractTestNGSpringContextTests {
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testFindById() {
		int id = 1;
		User user = userDao.findById(id);
		System.out.println(user.getName());
	}
	
	@Test
	public void testCreate() {
		User user = new User();
		user.setCreateTime(new Date());
		user.setLastModifyTime(new Date());
		user.setName("testuser");
		user.setPassword("testpppp");
		userDao.create(user);
	}
	
	@Test
	public void testFindByName() {
		String name = "s";
		User user = userDao.findByName(name);
		System.out.println(user.getId());
	}
}
