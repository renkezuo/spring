package com.renke.jms;


import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JMSSend {
	
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(new String[] {"spring-jms3.xml"});
		SendMsg sm = (SendMsg)context.getBean("sendMsg");
		Destination d = (Destination)new ActiveMQQueue("myMQ2");
		sm.sendMessage(d, "hello world MQ2");
		d = (Destination)new ActiveMQTopic("myMQ");
		sm.sendMessage(d, "hello world MQ");
		d = (Destination)new ActiveMQTopic("myMQ");
		sm.sendMessage(d, "hello world MQ");
		d = (Destination)new ActiveMQQueue("myMQ");
		sm.sendMessage(d, "hello world MQ");
		d = (Destination)new ActiveMQQueue("myMQ");
		sm.sendMessage(d, "hello world MQ");
	}
}
