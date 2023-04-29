package com.cruds.evs.dao;

import java.util.List;

import com.cruds.evs.bean.EOBean;

public interface EODAO {
	
	public boolean addEO(EOBean eobean);
	
	public List<EOBean> view();

}
