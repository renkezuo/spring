package com.renke.jms;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JMSEntry {

	private final static Logger logger = LoggerFactory.getLogger(JMSEntry.class);
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		logger.info("Æô¶¯jms-myMQ");
		new ClassPathXmlApplicationContext(new String[] {"spring-jms.xml"});
	}
}
