package com.cruds.evs.bean;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EVS_TBL_User_Profile")
public class ProfileBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pId;
	
	@Column(name="firstName",length=20)
	private String firstName; 

	@Column(name="lastName",length=20)
	private String lastName; 

	@Column(name="dateOfBirth")
	private String dateOfBirth; 

	@Column(name="gender",length=7)
	private String gender;

	@Column(name="street",length=30)
	private String street; 

	@Column(name="location",length=20)
	private String location; 

	@Column(name="city",length=20)
	private String city; 

	@Column(name="state",length=20)
	private String state; 

	@Column(name="pincode",length=10)
	private String pincode; 

	@Column(name="mobileNo",length=10)
	private String mobileNo; 

	@Column(name="emailID",length=30)
	private String emailID;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CredentialsBean voter;

	
	public ProfileBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfileBean(String firstName, String lastName, String dateOfBirth, String gender, String street,
			String location, String city, String state, String pincode, String mobileNo, String emailID,
			CredentialsBean voter) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.street = street;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
		this.emailID = emailID;
		this.voter = voter;
	}

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public CredentialsBean getVoter() {
		return voter;
	}

	public void setCustomer(CredentialsBean voter) {
		this.voter = voter;
	}

	
}
