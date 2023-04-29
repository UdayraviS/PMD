package com.cruds.evs.bean;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EVS_TBL_Election")
public class ElectionBean {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ElectionId;
	 
	
	@Column( length=20)
	private String electionname;
	
	@Column()
	private Date electionDate;
	
	@Column(length=20)
	private String district; 
	
	@Column(length=20)
	private String constituency; 
	
	@Column()
	private Date countingDate;
	
	  @OneToMany(mappedBy="election",cascade = CascadeType.ALL) 
	  private Set<CandidateBean> candidate;
	  
	  

	public ElectionBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectionBean( String electionname, Date electionDate, String district, String constituency,
			Date countingDate) {
		super();
		this.electionname = electionname;
		this.electionDate = electionDate;
		this.district = district;
		this.constituency = constituency;
		this.countingDate = countingDate;
		
		
	}

	public Set<CandidateBean> getCandidate() {
		return candidate;
	}

	public void setCandidate(Set<CandidateBean> candidate) {
		this.candidate = candidate;
	}

	

	public Long getElectionId() {
		return ElectionId;
	}

	public void setElectionId(Long ElectionId) {
		this.ElectionId = ElectionId;
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

	

	@Override
	public String toString() {
		return "ElectionBean [ ElectionId=" + ElectionId + ", electionname=" + electionname + ", electionDate="
				+ electionDate + ", district=" + district + ", constituency=" + constituency + ", countingDate="
				+ countingDate + "]";
	}
	  
	 
}