package com.cruds.evs.service;

import java.util.List;

import com.cruds.evs.bean.ApplicationBean;
import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.PartyBean;
import com.cruds.evs.form.ApplicationFormBean;
import com.cruds.evs.form.CandidateFormBean;
import com.cruds.evs.form.ProfileFormBean;

public interface AdminDAOService {

	
	 
	 public	boolean addParty(PartyBean partyBean);
		public	List<PartyBean> viewAllParty();
		
		public boolean addCandidate(CandidateFormBean candidateBean);
		List<CandidateBean> viewCandidateDetailsByElectionName();
		
		public boolean addApplication(ProfileFormBean applicationbean);
		   List<ApplicationBean> viewAllAdminPendingApplications();
		   
		   CandidateBean viewCandidateDetailsByParty(String partyId);
	
}
