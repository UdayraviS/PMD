package com.cruds.evs.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.ElectionBean;
import com.cruds.evs.bean.ProfileBean;
import com.cruds.evs.dao.AdminDAO;
import com.cruds.evs.dao.UserDAO;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.CandidateFormBean;
import com.cruds.evs.util.CandidateUtil;
import com.cruds.evs.util.ProfileUtil;
@Repository
public class ElectionServiceImpl implements ElectionService{
	
	@Autowired
	SessionFactory sf;
	
	@Autowired
	AdminDAO dao;

	@Override
	public boolean add(ElectionBean electionbean) throws EVSException {
		//ElectionBean eb = ElectionUtil.getcandBeanForSave(electionbean);
		return dao.addElection(electionbean);
		
	}

	@Override
	public List<ElectionBean> viewAllUpcomingElections() {
		
		return dao.viewAllUpcomingElections();
	}

	@Override
	public List<ElectionBean> viewElections() {
		return dao.viewElections();
	}

}
