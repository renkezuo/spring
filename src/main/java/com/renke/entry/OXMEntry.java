package com.renke.entry;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.XmlMappingException;

import com.renke.assist.OXMExample;
import com.renke.pojo.User;


public class OXMEntry {
	private static ApplicationContext context;
	public static void main(String[] args) throws XmlMappingException, IOException {
		context = new ClassPathXmlApplicationContext(new String[] {"spring-oxm.xml"});
		OXMExample oxmExample = context.getBean("oxmExample",OXMExample.class);
		User user = new User();
		user.setId(880012);
		user.setContact("123");
		user.setPassword("xixi");
		user.setSex(1);
		user.setRealName("ÖÐÎÄ");
		oxmExample.setUser(user);
		oxmExample.writeToFile();
		User user2 = (User) oxmExample.readByFile();
		System.out.println(user2.getRealName());
	}
}
