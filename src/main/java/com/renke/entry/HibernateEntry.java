package com.renke.entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.renke.assist.HibernateService;
import com.renke.pojo.User;

public class HibernateEntry {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(new String[] {"spring-hibernate.xml"});
//		SessionFactory sf = context.getBean("sessionFactory",SessionFactory.class);
//		System.out.println(sf);
		HibernateService service = context.getBean("service",HibernateService.class);
		service.insert();
		User user = service.findUser();
		System.out.println(user.getRealName());
	}
}
