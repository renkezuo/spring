package com.renke.jms;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JMSListener1 {

	private final static Logger logger = LoggerFactory.getLogger(JMSListener1.class);
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		logger.info("Æô¶¯jms-myMQ1");
		new ClassPathXmlApplicationContext(new String[] {"spring-jms1.xml"});
	}
}
