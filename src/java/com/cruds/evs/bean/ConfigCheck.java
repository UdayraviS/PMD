package com.cruds.evs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Config")
public class ConfigCheck {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false,length=100)
	private String msg;

	public ConfigCheck() {
		super();
		
	}
	public ConfigCheck(String msg) {
		super();
		this.msg = msg;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
