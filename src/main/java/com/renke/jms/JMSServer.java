package com.renke.jms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JMSServer {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext(new String[] {"spring-jms-server.xml"});
	}
}
