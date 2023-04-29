package com.cruds.evs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.evs.bean.ConfigCheck;
import com.cruds.evs.dao.ConfigDAO;

@Service
public class ConfigServiceImpl implements ConfigService {

	@Autowired
	ConfigDAO dao;
	
	@Override
	public boolean Check(ConfigCheck c) {
		// TODO Auto-generated method stub
		return dao.Check(c);
	}

}
