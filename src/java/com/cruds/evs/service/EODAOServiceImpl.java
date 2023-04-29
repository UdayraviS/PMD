package com.cruds.evs.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.evs.bean.EOBean;
import com.cruds.evs.dao.EODAO;
@Repository
public class EODAOServiceImpl implements EODAOService{

	
	@Autowired
	SessionFactory sf;
	
	@Autowired
	EODAO dao;
	
	
	@Override
	public boolean addEO(EOBean eobean) {
		return dao.addEO(eobean);
	}

	@Override
	public List<EOBean> view() {
		return dao.view();
	}

}
