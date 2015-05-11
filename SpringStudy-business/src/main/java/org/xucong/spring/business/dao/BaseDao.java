package org.xucong.spring.business.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseDao<E> {
	
	@PersistenceContext
    protected EntityManager em;
}
