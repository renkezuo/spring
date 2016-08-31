package com.renke.entry;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.renke.assist.MysqlDAO;
import com.renke.assist.MysqlService;

public class JDBCEntry {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(new String[] {"spring-jdbc.xml"});
		Object obj = context.getBean("dao");
		MysqlDAO mysql = (MysqlDAO)obj;
		mysql.testDB2();
		mysql.testDB2();
		mysql.testMysql();
		mysql.insertDB2();
		obj = context.getBean("service");
		MysqlService service = (MysqlService)obj;
		service.insertDB2();
	}
}
