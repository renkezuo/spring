package com.renke.jms;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JMSListener {

	private final static Logger logger = LoggerFactory.getLogger(JMSListener.class);
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		logger.info("����jms-myMQ");
		new ClassPathXmlApplicationContext(new String[] {"spring-jms.xml"});
	}
}
