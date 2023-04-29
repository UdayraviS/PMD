package com.cruds.evs.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.evs.bean.ApplicationBean;
import com.cruds.evs.bean.CredentialsBean;
import com.cruds.evs.bean.ProfileBean;
import com.cruds.evs.exception.EVSException;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sf;


	@Override
	public List<CredentialsBean> getAllCredentials() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<CredentialsBean> list =(List<CredentialsBean>) session
									.createQuery("from CredentialsBean")
									.list();
		session.close();
		return list;
	}

	@Override
	public List<ProfileBean> getAll() {
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<ProfileBean> list =(List<ProfileBean>) session
								.createQuery("from ProfileBean")
								.list(); 
		session.close();
		return list;
	}		
		@Override
		public CredentialsBean authenticate(String userID, String password) {
			Session session = sf.openSession();
			String hql = "from CredentialsBean c where c.userID=? and c.password = ? ";

			@SuppressWarnings("unchecked")
			List<CredentialsBean> list = session.createQuery(hql)
			.setString(0, userID)
			.setString(1, password)
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
		/*public CredentialsBean authenticate(String userID, String password) {
			Session session = sf.openSession();
			String hql = "from CredentialsBean c where c.userID=? and c.password = ? ";

			@SuppressWarnings("unchecked")
			List<CredentialsBean> list = session.createQuery(hql)
			.setString(0, userID)
			.setString(1, password)
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
*/

		@Override
	public boolean createLogin(ApplicationBean user) throws EVSException {
		Session session = sf.openSession();		
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return true;
	}

		@Override
		public void inActivateUser(CredentialsBean user) {
			Session session = sf.openSession();
			session.beginTransaction();
			session.update(user);
			System.out.println(user);
			session.getTransaction().commit();
			session.close();
			
		}

		@Override
		public boolean inActivate(Long id) {
			Session session = sf.openSession();		
			session.beginTransaction();
			String hql = "update CredentialsBean set isActive='N' where id=?";
			Query query = session.createQuery(hql);
			query.setParameter(0,1);
			int row =  query.executeUpdate();
			session.close();
			return row > 0;
		}
         
		
		@Override
		public CredentialsBean findUserById(Long id) {
			
			Session session = sf.openSession();
			String hql = "from CredentialsBean c where c.id = ? ";

			@SuppressWarnings("unchecked")
			List<CredentialsBean> list = session.createQuery(hql).setLong(0, id).list();
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
		public ProfileBean edit(Long id) {
			Session session = sf.openSession();
			String hql = "from ProfileBean p where p.id = ? ";

			@SuppressWarnings("unchecked")
			List<ProfileBean> list = session.createQuery(hql).setLong(0, id).list();
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
		public void update(ProfileBean user) {
			Session session = sf.openSession();
			session.beginTransaction();
			session.update(user);
			System.out.println(user);
			session.getTransaction().commit();
			session.close();
			
		}

		@Override
		public List<CredentialsBean> findByName(String userID) {
			Session session = sf.openSession();
			@SuppressWarnings("unchecked")
			List<CredentialsBean> list =(List<CredentialsBean>) session
			.createQuery("from CredentialsBean where userID like ? and isActive='Y' ")
			.setString(0, userID)
			.list(); 
				
			session.close();
			return list;
		}

		

	
	}

