package com.renke.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

public class SpringTest {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(new String[] {"spring-redis.xml"});
		JedisConnectionFactory jcf = context.getBean("redis",JedisConnectionFactory.class);
		RedisConnection rc = jcf.getConnection();
		System.out.println(new String(rc.get("hello".getBytes())));
	}
}
