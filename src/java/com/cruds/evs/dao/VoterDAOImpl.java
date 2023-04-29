package com.cruds.evs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.ResultBean;
@Repository
public class VoterDAOImpl implements VoterDAO{


	@Autowired
	private SessionFactory sf;



	@Override
	public CandidateBean castVote(long electionId, String candiadteId) {
			Session session = sf.openSession();
			String hql = "select c.id,c.candidateId,c.candidateName,c.dateOfBirth,c.mobileNo,c.address,c.emailID,a.electionname,a.electionDate,a.district,a.constituency,a.countingDate from CandidateBean c, ElectionBean a where c.candidateId= 1 and c.ElectionId= 1";

			@SuppressWarnings("unchecked")
			List<CandidateBean> list = session.createQuery(hql)
			.setLong(0, electionId)
			.setString(1, candiadteId)
			.list();
			System.out.println(list);
			session.close();

			if(list.size() > 0)
			{
				return list.get(0);
			}
			else 
			{
				return null;
		
		
	}
	
	}



	@Override
	public boolean addResult(ResultBean resultbean) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(resultbean);
		session.getTransaction().commit();
		session.close();
		return true;

	}



	@Override
	public List<ResultBean> viewListOfElectionsResults() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<ResultBean> list =(List<ResultBean>) session
								.createQuery("from ResultBean")
								.list(); 
		session.close();
		return list;
	}
}



