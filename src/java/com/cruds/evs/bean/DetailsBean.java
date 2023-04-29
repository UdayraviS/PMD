package com.cruds.evs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class DetailsBean {
	
	@Id
	@GeneratedValue
	private long serialNo;
	
	@Column(length=8, nullable=false)
	private String voterId;

}
