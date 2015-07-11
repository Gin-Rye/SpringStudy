package com.xucong.springstudy.business.dao.user;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.xucong.springstudy.base.dao.BaseDao;
import com.xucong.springstudy.domain.user.User;

@Repository
public class UserDao extends BaseDao<User> {
	public User findByName(String name) {
		Query query = em.createQuery("select o from User o where o.name = :name");
		query.setParameter("name", name);
		User user = (User) query.getSingleResult();
		return user;
	}
}
