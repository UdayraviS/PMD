package com.cruds.evs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.evs.bean.EOBean;

@Repository
public class EOBeanImpl implements EODAO{


	@Autowired
	SessionFactory sf;

	
	
	@Override
	public boolean addEO(EOBean eobean) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(eobean);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public List<EOBean> view() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<EOBean> list =(List<EOBean>) session
								.createQuery("from EOBean")
								.list(); 
		session.close();
		return list;
	}

}
