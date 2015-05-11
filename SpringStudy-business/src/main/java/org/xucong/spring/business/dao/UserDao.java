package org.xucong.spring.business.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.xucong.spring.domain.User;

@Repository
public class UserDao extends BaseDao<User> {
	public List<User> queryAll() {
		String hql = "from User o";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}
}
