package com.cruds.evs.dao;

import java.util.List;

import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.ResultBean;

public interface VoterDAO {
	
	 CandidateBean castVote( long electionId, String candiadteId);
	 
	 public boolean addResult(ResultBean resultbean);
	 
	 List<ResultBean> viewListOfElectionsResults();
	
	

}
