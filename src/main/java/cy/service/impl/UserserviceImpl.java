package cy.service.impl;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cy.dao.UserDaoI;
import cy.model.Userfirst;
import cy.service.UserserviceI;

@Service("userService")
public class UserserviceImpl implements UserserviceI {
	/**
	 * Logger for this class
	 */
	private UserDaoI userDao;
	
	public UserDaoI getUserDao() {
		return userDao;
	}
	
	@Autowired
	public void setUserDao(UserDaoI userDao) {
		this.userDao = userDao;
	}

	private static final Logger logger = Logger
			.getLogger(UserserviceImpl.class);

	@Override
	public void test() {
		logger.info("sshe");
		
		/*System.out.println("sshe");*/
		

	}

	@Override
	public Serializable save(Userfirst u) {
		// TODO Auto-generated method stub
		return userDao.save(u);
	}

}
