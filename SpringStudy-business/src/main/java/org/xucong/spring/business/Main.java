package org.xucong.spring.business;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xucong.spring.business.dao.UserDao;
import org.xucong.spring.business.service.UserService;
import org.xucong.spring.domain.User;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = ctx1.getBean(UserService.class);
		System.out.println(service.dao);
		UserDao dao = ctx1.getBean(UserDao.class);
		System.out.println(dao);
		dao.addUser("xc");
		List<User> list = service.queryAll();
		System.out.println(list.size());
	}
}
