package cy.action;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cy.service.UserserviceI;

@ParentPackage("basePackage")
@Namespace("/")
@Action(value="userAction")
public class UserAction {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(UserAction.class);
	
	private UserserviceI userService;
	
	public UserserviceI getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserserviceI userService) {
		this.userService = userService;
	}

	public void test(){
		
		logger.info("进入action");
		
		/*ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
		UserserviceI userService = (UserserviceI)ac.getBean("userService");*/
		userService.test();
	}

}
