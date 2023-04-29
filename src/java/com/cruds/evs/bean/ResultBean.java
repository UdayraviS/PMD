package com.cruds.evs.bean;

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
@Table(name="EVS_TBL_Result")
public class ResultBean {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Serialno;
		
	@Column(name="Votecount",length=5, nullable= false)
	private String votecnt;
	
	@OneToOne(cascade = CascadeType.ALL) 
	private CandidateBean candidate;
	
	@OneToOne(cascade = CascadeType.ALL) 
	private ElectionBean election ;
	
	

	public ResultBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResultBean(String votecnt, CandidateBean candidate, ElectionBean election) {
		super();
		this.votecnt = votecnt;
		this.candidate = candidate;
		this.election = election;
	}

	public int getSerialno() {
		return Serialno;
	}

	public void setSerialno(int serialno) {
		Serialno = serialno;
	}

	public String getVotecnt() {
		return votecnt;
	}

	public void setVotecnt(String votecnt) {
		this.votecnt = votecnt;
	}

	public CandidateBean getCandidate() {
		return candidate;
	}

	public void setCandidate(CandidateBean candidate) {
		this.candidate = candidate;
	}

	public ElectionBean getElection() {
		return election;
	}

	public void setElection(ElectionBean election) {
		this.election = election;
	}
	
	
   	 

	
	
	
}
