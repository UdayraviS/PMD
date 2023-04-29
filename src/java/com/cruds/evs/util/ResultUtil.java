package com.cruds.evs.util;

import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.ElectionBean;
import com.cruds.evs.bean.ResultBean;
import com.cruds.evs.form.ResultFormBean;

public class ResultUtil {
	
	public static ResultBean getResBeanForSave(ResultFormBean resultFormBean)
	{
		ElectionBean eb = new ElectionBean();
		CandidateBean cb = new CandidateBean();
		
		ResultBean rb = new ResultBean(resultFormBean.getVotecnt(),cb,eb);
		
		return rb;
		
	}
}
