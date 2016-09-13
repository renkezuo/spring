package com.renke.jms;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JMSListener2 {

	private final static Logger logger = LoggerFactory.getLogger(JMSListener2.class);
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		logger.info("Æô¶¯jms-myMQ2");
		new ClassPathXmlApplicationContext(new String[] {"spring-jms2.xml"});
	}
}
