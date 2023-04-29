package com.cruds.evs.service;

import java.util.List;

import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.ResultBean;
import com.cruds.evs.form.ResultFormBean;

public interface VoterService {
	
	 CandidateBean castVote( long electionId, String candiadteId);
	 
public boolean addResult(ResultFormBean resultbean);
	 
	 List<ResultBean> viewListOfElectionsResults();
	
	

}
