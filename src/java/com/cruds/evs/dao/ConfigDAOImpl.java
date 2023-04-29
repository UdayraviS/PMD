package com.cruds.evs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.evs.bean.ConfigCheck;

@Repository
public class ConfigDAOImpl implements ConfigDAO{
	
	@Autowired
	SessionFactory sf;

	@Override
	public boolean Check(ConfigCheck c) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		session.close();
		return true;	
	}
	
}
