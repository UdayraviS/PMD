package com.cruds.evs.dao;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.evs.bean.ApplicationBean;
import com.cruds.evs.bean.CandidateBean;
import com.cruds.evs.bean.ElectionBean;
import com.cruds.evs.bean.PartyBean;
import com.cruds.evs.bean.ProfileBean;
@Repository
public class AdminDAOImpl implements AdminDAO{
	
	private static Session session;

	@Autowired
	SessionFactory sf;

	
	@Override
	public boolean addElection(ElectionBean electionBean) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(electionBean);
		session.getTransaction().commit();
		session.close();
		return true;
		
		
	}


	@Override
	public List<ElectionBean> viewAllUpcomingElections() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<ElectionBean> list =(List<ElectionBean>) session
								.createQuery("from ElectionBean")
								.list(); 
		session.close();
		return list;
		
	}


	@Override
	public List<ElectionBean> viewElections() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<ElectionBean> list =(List<ElectionBean>) session
								.createQuery("from ElectionBean")
								.list(); 
		session.close();
		return list;
		
	}


	@Override
	public boolean addParty(PartyBean partyBean) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(partyBean);
		session.getTransaction().commit();
		session.close();
		return true;
		
		
	}


	@Override
	public List<PartyBean> viewAllParty() {
			Session session = sf.openSession();
			@SuppressWarnings("unchecked")
			List<PartyBean> list =(List<PartyBean>) session
									.createQuery("from PartyBean")
									.list(); 
			session.close();
			return list;

	}


	@Override
	public boolean addCandidate(CandidateBean candidateBean) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(candidateBean);
		session.getTransaction().commit();
		session.close();
		return true;
		
	
	}


	@Override
	public List<CandidateBean> viewCandidateDetailsByElectionName() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<CandidateBean> list =(List<CandidateBean>) session
								.createQuery("from CandidateBean")
								.list(); 
		session.close();
		return list;
	}



	@Override
	public boolean addApplication(ApplicationBean applicationbean) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(applicationbean);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public List<ApplicationBean> viewAllAdminPendingApplications() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<ApplicationBean> list =(List<ApplicationBean>) session
								.createQuery("from ApplicationBean")
								.list(); 
		session.close();
		return list;
	
	}


	@Override
	public CandidateBean viewCandidateDetailsByParty(String partyId) {
		return null;
	 
		/*Session session =sf.openSession();
		session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<CandidateBean> criteriaQuery = builder.createQuery(CandidateBean.class);
		Root<CandidateBean> root = criteriaQuery.from(CandidateBean.class);
		root.join("party");
		
      Query query = session.createQuery(criteriaQuery)	;
      
      <CandidateBean> resultList = query.getResultList();
      
      for(CandidateBean candidateBean :resultList ){
    	  System.out.println(candidateBean.getParty());*/
   } 	  
  
      
      
      
		/*Session session = sf.openSession();
        session.beginTransaction();
        Criteria cr = session.createCriteria(CandidateBean.class);
		cr.add(Restrictions.eq("partyId",partyId));
		//session.close();
		CandidateBean existing = (CandidateBean) cr.uniqueResult();
		
		if(existing == null)
        {
			 Criteria cr2 = session.createCriteria(CandidateBean.class);
			 cr2.add(Restrictions.eq("partyId",partyId));
			 existing = (CandidateBean) cr2.uniqueResult();
        }
       session.getTransaction().commit();
       return existing;
       */
       
		
		
		
		/*
		Session session = sf.openSession();
		String hql = "select c.id,c.candidateId,c.candidateName,c.dateOfBirth,c.mobileNo,c.address,c.emailID,a.evs_tbl_party from evs_tbl_candidate c inner join evs_tbl_party a on c.PartyId = a.PartyId";

		@SuppressWarnings("unchecked")
		List<CandidateBean> list = session.createQuery(hql)
		.setString(0, partyId)
		.list();
		System.out.println(list);
		session.close();

		if(list.size() > 0)
		{
			return (List<CandidateBean>) list.get(0);
		}
		else 
		{*/
		
			
			
				
}




	
	

