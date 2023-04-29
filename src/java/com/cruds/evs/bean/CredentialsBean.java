package com.cruds.evs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="EVS_TBL_User_Credentials")
public class CredentialsBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=6,name="userID")
	private String userID;
	
	@Column(name="password",length=20)
	private String password;
	
	@ColumnDefault("'V'")
	@Column(name="userType",length=15)
	private String userType = "V";   //(admin or EO)
	
	@Column(name="loginStatus",length=1)
	private int loginStatus = 1;   //(1 ,0)
	
	@Column(name="isActive")
	private String isActive = "Y";

	
	public CredentialsBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CredentialsBean(String userID, String password, String userType, int loginStatus, String isActive) {
		super();
		this.userID = userID;
		this.password = password;
		this.userType = userType;
		this.loginStatus = loginStatus;
		this.isActive = isActive;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "CredentialsBean [userID=" + userID + ", password=" + password + ", userType=" + userType
				+ ", loginStatus=" + loginStatus + ", isActive=" + isActive + "]";
	}
	
}