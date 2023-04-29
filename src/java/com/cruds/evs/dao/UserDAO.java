package com.cruds.evs.dao;

import java.util.List;

import com.cruds.evs.exception.EVSException;
import com.cruds.evs.bean.ApplicationBean;
import com.cruds.evs.bean.CredentialsBean;
import com.cruds.evs.bean.ProfileBean;
import com.cruds.evs.exception.EVSException;

public interface UserDAO {
	
	public boolean createLogin(ApplicationBean cb) throws EVSException;//credentials->profile
	
	CredentialsBean authenticate(String userID , String password);
	
	public List<CredentialsBean> getAllCredentials(); 
	
	public List<ProfileBean> getAll();
	
	public ProfileBean edit(Long id);
	public void update(ProfileBean user);
	
	public void inActivateUser(CredentialsBean user);
	public boolean inActivate(Long id);
	
	CredentialsBean findUserById(Long id);

//	boolean createLogin(ProfileBean user) throws EVSException; 
	
	public List<CredentialsBean> findByName(String userID);
	
}
