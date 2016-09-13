package com.renke.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class BaseTest {
	@SuppressWarnings("resource")
	@Test
	public void client(){
		Jedis jedis = new Jedis("10.10.3.218",6379);
		jedis.auth("renkezuo");
		String value = jedis.get("hello");
		System.out.println(value);
		value = jedis.get("wo");
		System.out.println(value);
	}
}
