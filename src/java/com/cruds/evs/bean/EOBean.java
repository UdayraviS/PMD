package com.cruds.evs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="officier")
public class EOBean {

	@Id
	private long electoralOfficerID;

	@Column(length=20, nullable = false)
	private String areaconstituency;
		

	public EOBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EOBean(long electoralOfficerID, String areaconstituency) {
		super();
		this.electoralOfficerID = electoralOfficerID;
		this.areaconstituency = areaconstituency;
	}

	public long getElectoralOfficerID() {
		return electoralOfficerID;
	}

	public void setElectoralOfficerID(long electoralOfficerID) {
		this.electoralOfficerID = electoralOfficerID;
	}

	public String getareaconstituency() {
		return areaconstituency;
	}

	public void setareaconstituency(String areaconstituency) {
		this.areaconstituency = areaconstituency;
	}

	
	
	
}
