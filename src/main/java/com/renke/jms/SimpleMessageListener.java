package com.renke.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleMessageListener implements MessageListener {
	
	private final static Logger logger = LoggerFactory.getLogger(SimpleMessageListener.class);
	
	@Override
	public void onMessage(Message message) {
		logger.info("---------------消费者[{}]接收消息-----------------",Thread.currentThread().getName());
		if(message instanceof TextMessage){
			TextMessage msg = (TextMessage) message;
			try {
				logger.info(msg.getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}else{
			logger.info(message.toString());
		}
	}
}
