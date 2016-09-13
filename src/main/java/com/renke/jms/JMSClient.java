package com.renke.jms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JMSClient {
	private static ApplicationContext context;
	public static void main(String[] args) throws InterruptedException {
		context = new ClassPathXmlApplicationContext(new String[] {"spring-jms-client.xml"});
        CheckingAccountService service = (CheckingAccountService) context.getBean("checkingAccountService");
        service.cancelAccount(new Long(10));
        System.out.println(1111);
	}
}
