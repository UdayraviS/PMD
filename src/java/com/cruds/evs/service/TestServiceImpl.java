package com.cruds.evs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.evs.db.TestDAO;
import com.cruds.evs.entity.TestEntity;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestDAO testDAO;
	
	@Override
	public boolean create(TestEntity te) {
		
		return testDAO.create(te);
	}

}
