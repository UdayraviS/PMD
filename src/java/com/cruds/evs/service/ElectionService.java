package com.cruds.evs.service;

import java.util.List;

import com.cruds.evs.bean.ElectionBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.CandidateFormBean;

public interface ElectionService{
	
	//public boolean add(ElectionForm ef) throws EVSException;
	
	public  List<ElectionBean> viewAllUpcomingElections();
	 public	List<ElectionBean> viewElections();

	boolean add(ElectionBean electionbean) throws EVSException;
	 

}
