package com.cruds.evs.util;

import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.ElectionBean;
import com.cruds.evs.bean.PartyBean;
import com.cruds.evs.form.CandidateFormBean;

public class CandidateUtil {
	
	public static CandidateBean getCandBeanForSave(CandidateFormBean candidateFormBean)
	{
		
		PartyBean pb = new PartyBean(candidateFormBean.getPartyId(),candidateFormBean.getPartyName(),candidateFormBean.getLeader(),candidateFormBean.getSymbol());
		
	ElectionBean e = new ElectionBean(candidateFormBean.getelectionname(),candidateFormBean.getElectionDate(),candidateFormBean.getDistrict(),candidateFormBean.getConstituency(),candidateFormBean.getCountingDate());	
	
	CandidateBean cb = new CandidateBean(candidateFormBean.getCandidateId(),candidateFormBean.getCandidateName(),candidateFormBean.getDateOfBirth(),candidateFormBean.getMobileNo(),candidateFormBean.getAddress(),candidateFormBean.getEmailID(),pb,e);
    
		
		return cb ;
}

}