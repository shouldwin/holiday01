package cy.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import cy.service.UserserviceI;

@Service("userService")
public class UserserviceImpl implements UserserviceI {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(UserserviceImpl.class);

	@Override
	public void test() {
		logger.info("sshe");
		
		/*System.out.println("sshe");*/
		

	}

}
