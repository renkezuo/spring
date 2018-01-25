package com.renke.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.DispatcherServlet;

import com.renke.assist.AspectAdvise;
import com.renke.template.MsgBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-test.xml")
@Component("springTest")
public class SpringTest {
	@Autowired
	@Qualifier("msgBean")
	private MsgBean msg;

	@Autowired
	private AspectAdvise aspectAdvise;

	@Test
	public void testSend() {
		aspectAdvise.before();
		msg.showMsg("hello world");
	}
}
