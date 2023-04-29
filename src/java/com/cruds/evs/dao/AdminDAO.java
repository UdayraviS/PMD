package com.cruds.evs.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.sql.Connection;

import com.cruds.evs.bean.ApplicationBean;
import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.ElectionBean;
import com.cruds.evs.bean.PartyBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.CandidateFormBean;

public interface AdminDAO {

   public boolean addElection(ElectionBean electionBean);
	
 public  List<ElectionBean> viewAllUpcomingElections();
 public	List<ElectionBean> viewElections();
 
 
 
 public	boolean addParty(PartyBean partyBean);
	public	List<PartyBean> viewAllParty();
	public boolean addCandidate(CandidateBean candidateBean);
	List<CandidateBean> viewCandidateDetailsByElectionName();
	
	public boolean addApplication(ApplicationBean applicationbean);
   List<ApplicationBean> viewAllAdminPendingApplications();
	//boolean forwardVoterIDRequest(String userId)
	CandidateBean viewCandidateDetailsByParty(String partyId);
	//Map approveElectionResults(String electionId)
	
	
}
