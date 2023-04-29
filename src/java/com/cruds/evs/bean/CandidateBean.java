package com.cruds.evs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="EVS_TBL_Candidate")
public class CandidateBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=6)
	private String candidateId; 

	@Column(length=20)
	private String candidateName; 
	
	@Column()
	private Date dateOfBirth; 
	
	@Column(length=10)
	private String mobileNo; 
	
	@Column(length=50)
	private String address; 
	
	@Column(length=30)
	private String emailID;
	
	@ManyToOne(cascade = CascadeType.ALL)        
	@JoinColumn(name="PartyId")    //(fetch = FetchType.LAZY)
	private PartyBean party;
    	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn(name="ElectionId")
	private ElectionBean election ;
	
	
	public CandidateBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public CandidateBean(String candidateId, String candidateName, Date dateOfBirth, String mobileNo, String address,
			String emailID, PartyBean party, ElectionBean election) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.dateOfBirth = dateOfBirth;
		this.mobileNo = mobileNo;
		this.address = address;
		this.emailID = emailID;
		this.party = party;
		this.election = election;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public PartyBean getParty() {
		return party;
	}


	public void setParty(PartyBean party) {
		this.party = party;
	}


	public ElectionBean getElection() {
		return election;
	}


	public void setElection(ElectionBean election) {
		this.election = election;
	}



	@Override
	public String toString() {
		return "CandidateBean [id=" + id + ", candidateId=" + candidateId + ", candidateName=" + candidateName
				+ ", dateOfBirth=" + dateOfBirth + ", mobileNo=" + mobileNo + ", address=" + address + ", emailID="
				+ emailID + ", party=" + party + ", election=" + election + "]";
	}



    	

	
	
}
