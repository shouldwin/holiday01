package cy.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cy.dao.UserDaoI;
import cy.model.Userfirst;

@Repository("userDao")
public class UserDaoImpl implements UserDaoI {
	
	private SessionFactory sessionFactory;
	
		
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public Serializable save(Userfirst u) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().save(u);
	}

}
