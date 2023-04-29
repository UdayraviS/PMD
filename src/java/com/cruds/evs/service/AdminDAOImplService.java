package com.cruds.evs.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cruds.evs.bean.ApplicationBean;
import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.PartyBean;
import com.cruds.evs.bean.ProfileBean;
import com.cruds.evs.dao.AdminDAO;
import com.cruds.evs.form.ApplicationFormBean;
import com.cruds.evs.form.CandidateFormBean;
import com.cruds.evs.form.ProfileFormBean;
import com.cruds.evs.util.ApplicationUtil;
import com.cruds.evs.util.CandidateUtil;
import com.cruds.evs.util.ProfileUtil;

@Repository
public class AdminDAOImplService implements AdminDAOService{
 
	
	@Autowired
	SessionFactory sf;
	
	@Autowired
	AdminDAO dao;

	
	@Override
	public boolean addParty(PartyBean partyBean) {
		return dao.addParty(partyBean);
	}

	@Override
	public List<PartyBean> viewAllParty() {
		return dao.viewAllParty();
	}

	@Override
	public boolean addCandidate(CandidateFormBean candidateBean) {
		CandidateBean cb = CandidateUtil.getCandBeanForSave(candidateBean);
		
		return dao.addCandidate(cb);
	}

	@Override
	public List<CandidateBean> viewCandidateDetailsByElectionName() {
		return dao.viewCandidateDetailsByElectionName();
	}

	/*@Override
	public boolean addApplication(ApplicationFormBean applicationbean){
	
		ApplicationBean ap = ApplicationUtil.getApplicationBeanForSave(applicationbean);
		return dao.addApplication(ap);
	}
*/
	@Override
	public List<ApplicationBean> viewAllAdminPendingApplications() {
		return dao.viewAllAdminPendingApplications();
	}

	@Override
	public CandidateBean viewCandidateDetailsByParty(String partyId) {
		return dao.viewCandidateDetailsByParty(partyId);
	}

	@Override
	public boolean addApplication(ProfileFormBean applicationbean) {
		ApplicationBean ap = ProfileUtil.getCredBeanForSave(applicationbean);
		return dao.addApplication(ap);
	}

	public boolean addCandidate(CandidateBean candidatebean) {
		// TODO Auto-generated method stub
		return dao.addCandidate(candidatebean);
	}
	
}
