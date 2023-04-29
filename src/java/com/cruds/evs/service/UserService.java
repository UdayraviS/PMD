package com.cruds.evs.service;

import java.util.List;

import com.cruds.evs.bean.CredentialsBean;
import com.cruds.evs.bean.ProfileBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.ProfileFormBean;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.ProfileFormBean;

public interface UserService {
	
	public boolean create(ProfileFormBean user) throws EVSException;
	
	//public boolean createLogin(CredentialsBean user) throws EVSException;
	
	CredentialsBean authenticate(String userID , String password);
	
	public List<CredentialsBean> getAllCredentials();
	
	public List<ProfileBean> getAll();
	
	public void inActivateUser(CredentialsBean user);
	public boolean inActivate(Long id);
	
	CredentialsBean findUserById(Long id);
	
	
    public ProfileBean edit(Long id);
	
	public void update(ProfileBean user);
	
	

}
