package com.cruds.evs.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.evs.bean.ApplicationBean;
import com.cruds.evs.bean.CredentialsBean;
import com.cruds.evs.bean.ProfileBean;
import com.cruds.evs.dao.UserDAO;
import com.cruds.evs.exception.EVSException;
import com.cruds.evs.form.ProfileFormBean;
import com.cruds.evs.util.ProfileUtil;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO dao;

	
	@Override
	public List<CredentialsBean> getAllCredentials() {
		return dao.getAllCredentials();
	}

	@Override
	public List<ProfileBean> getAll() {
		return dao.getAll();
	}

/*	@Override
	public void delete(Long id) {
		dao.delete(id);		
	}
*/
	

	public boolean create(ProfileFormBean user) throws EVSException {
		ApplicationBean cb = ProfileUtil.getCredBeanForSave(user);
		return dao.createLogin(cb);
	}

	@Override
	public CredentialsBean authenticate(String userID, String password) {
		return dao.authenticate(userID, password);
	}

	@Override
	public void inActivateUser(CredentialsBean user) {
		dao.inActivateUser(user);
		
	}
	
	public Set<CredentialsBean> searchUser(Long id, String userID)
	{
		Set<CredentialsBean> userSet = new HashSet<>();
		if(userID != null && (userID.trim().length() > 0 ))
		{
			userSet.addAll(dao.findByName(userID));
		}
		if(id != null && (id > 0))
		{
			CredentialsBean user = dao.findUserById(id); //check null since set allows null
			if (user != null) userSet.add(user);
		}
		return userSet;
	}

	@Override
	public boolean inActivate(Long id) {
	
		return dao.inActivate(id);
	}

	@Override
	public CredentialsBean findUserById(Long id) {
		return dao.findUserById(id);
	}

	@Override
	public ProfileBean edit(Long id) {
		return dao.edit(id);
	}

	@Override
	public void update(ProfileBean user) {
		System.out.println(user);
		dao.update(user);
		
	}

	
}
