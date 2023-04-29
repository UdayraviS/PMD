package com.cruds.evs.util;


import com.cruds.evs.bean.ApplicationBean;
import com.cruds.evs.bean.CredentialsBean;
import com.cruds.evs.bean.ProfileBean;
import com.cruds.evs.form.ProfileFormBean;

public class  ProfileUtil {

	public static ApplicationBean getCredBeanForSave(ProfileFormBean customerFormBean)
	{
		CredentialsBean cb = new CredentialsBean(customerFormBean.getUserID()
								, customerFormBean.getPassword(),"V"
								, 1,"Y");
		
		ProfileBean pb = new ProfileBean(customerFormBean.getFirstName(),customerFormBean.getLastName(),customerFormBean.getDateOfBirth(),customerFormBean.getGender(),customerFormBean.getStreet(),customerFormBean.getLocation(),customerFormBean.getCity(),customerFormBean.getState(),customerFormBean.getPincode(),customerFormBean.getMobileNo(),customerFormBean.getEmailID(),cb);
		
ApplicationBean	ap = new ApplicationBean(customerFormBean.getConstituency(),cb,pb);	

		return ap;

	}

}



