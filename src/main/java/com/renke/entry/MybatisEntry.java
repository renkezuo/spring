package com.renke.entry;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.renke.assist.MybatisService;

public class MybatisEntry {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(new String[] {"spring-mybatis.xml"});
		Object obj = context.getBean("service");
		MybatisService mybatis = (MybatisService)obj;
		System.out.println(mybatis);
		mybatis.getUser();
	}
}
