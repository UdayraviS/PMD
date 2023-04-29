package com.cruds.evs.form;

import java.util.Date;

public class CandidateFormBean {

	private String ElectionId; 
	private String electionname;
	private Date electionDate;
	private String district; 
	private String constituency; 
	private Date countingDate;
	
	private String partyId;
	private String partyName;
	private String leader;
	private String symbol;
	
	private String candidateId; 
	private String candidateName; 
	private Date dateOfBirth; 
	private String mobileNo; 
	private String address;
	private String emailID;
	
	
	
		
	public CandidateFormBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getPartyName() {
		return partyName;
	}


	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}


	public String getPartyId() {
		return partyId;
	}


	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}


	public String getLeader() {
		return leader;
	}


	public void setLeader(String leader) {
		this.leader = leader;
	}


	public String getSymbol() {
		return symbol;
	}


	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	public String getElectionId() {
		return ElectionId;
	}
	public void setElectionId(String electionId) {
		this.ElectionId = electionId;
	}
	public String getelectionname() {
		return electionname;
	}
	public void setelectionname(String electionname) {
		this.electionname = electionname;
	}
	public Date getElectionDate() {
		return electionDate;
	}
	public void setElectionDate(Date electionDate) {
		this.electionDate = electionDate;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public Date getCountingDate() {
		return countingDate;
	}
	public void setCountingDate(Date countingDate) {
		this.countingDate = countingDate;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	
}
