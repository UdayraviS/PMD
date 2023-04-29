package com.cruds.evs.bean;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="EVS_TBL_Application")
public class ApplicationBean {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name="Constituency",length=20)
	private String constituency; 
	
	@ColumnDefault("'A'")
	@Column(length=1)
	private String passedstatus="A";
	
	@ColumnDefault("'O'")
	@Column(length=1)
	private String approvedstatus="O";
	
	@Column(length=8)
	private String voterId=UUID.randomUUID().toString().substring(0, 7); 
	
	@OneToOne(cascade = CascadeType.ALL)
	private ProfileBean user;
	
	

	public ApplicationBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ApplicationBean( String constituency, CredentialsBean cb, ProfileBean user) {
		super();
		this.constituency = constituency;
		this.passedstatus = passedstatus;
		this.approvedstatus = approvedstatus;
		this.voterId = voterId;
		this.user = user;
	}
	

	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public String getPassedstatus() {
		return passedstatus;
	}

	public void setPassedstatus(String passedstatus) {
		this.passedstatus = passedstatus;
	}

	public String getApprovedstatus() {
		return approvedstatus;
	}

	public void setApprovedstatus(String approvedstatus) {
		this.approvedstatus = approvedstatus;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public ProfileBean getuser() {
		return user;
	}

	public void setuser(ProfileBean user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ApplicationBean [Id=" + Id + ", constituency=" + constituency + ", passedstatus="
				+ passedstatus + ", approvedstatus=" + approvedstatus + ", voterId=" + voterId + ", user=" + user
				+ "]";
	}

	
	
}
