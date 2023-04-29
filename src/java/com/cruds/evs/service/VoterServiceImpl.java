package com.cruds.evs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.ResultBean;
import com.cruds.evs.dao.VoterDAO;
import com.cruds.evs.form.ResultFormBean;
import com.cruds.evs.util.CandidateUtil;
import com.cruds.evs.util.ResultUtil;

@Service
public class VoterServiceImpl implements VoterService {
	
@Autowired
VoterDAO dao;

@Override
public CandidateBean castVote(long electionId, String candiadteId) {
	return dao.castVote(electionId, candiadteId);
}


@Override
public List<ResultBean> viewListOfElectionsResults() {
	return dao.viewListOfElectionsResults();
}

@Override
public boolean addResult(ResultFormBean resultbean) {
	ResultBean rb = ResultUtil.getResBeanForSave(resultbean);
	
	return dao.addResult(rb);
	
}

}
