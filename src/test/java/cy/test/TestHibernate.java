package cy.test;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cy.model.Userfirst;
import cy.service.UserserviceI;

public class TestHibernate {

	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
		UserserviceI userService = (UserserviceI) ac.getBean("userService");
		Userfirst u = new Userfirst();
		u.setId(UUID.randomUUID().toString());
		u.setName("cy");
		u.setPwd("1278");
		u.setCreatedatetime(new Date());
		userService.save(u);
	}
}
