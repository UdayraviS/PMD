package com.cruds.evs.service;

import java.util.List;

import com.cruds.evs.bean.EOBean;

public interface EODAOService {
	
  public boolean addEO(EOBean eobean);
	
	public List<EOBean> view();


}
