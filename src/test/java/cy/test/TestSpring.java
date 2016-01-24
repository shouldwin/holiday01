package cy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cy.service.UserserviceI;

public class TestSpring {
	
	@Test
	public void test(){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
		UserserviceI userService = (UserserviceI)ac.getBean("userService");
		userService.test();
	}

}
