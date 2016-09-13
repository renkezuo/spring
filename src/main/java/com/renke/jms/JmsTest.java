package com.renke.jms;

import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-jms.xml")
public class JmsTest {
	@Autowired
	private SendMsg sendMsg;
	
	@Autowired
	@Qualifier("queue")
	private Destination destination;

	@Test
	public void testSend() {
//		int i = 0;
		for (int i = 0; i < 20; i++) {
			sendMsg.sendMessage(destination, "你好，消费者！这是消息：" + (i+1));
		}
	}
}
