package com.renke.assist;


import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlDAO {
	JdbcTemplate mysql;
	JdbcTemplate db2;
	
	public void testMysql(){
		long begin = System.currentTimeMillis();
		Map<String,Object> map = mysql.queryForMap("select count(*) cnt from user ");
		System.out.println("testMysql jdbcTemplate:"+mysql+" cnt:"+map.get("cnt"));
		System.out.println("execute:"+(System.currentTimeMillis()-begin));
	}
	
	public void testDB2(){
		long begin = System.currentTimeMillis();
		Map<String,Object> map = db2.queryForMap("select count(*) cnt from user ");
		System.out.println("testDB2 jdbcTemplate:"+db2+" cnt:"+map.get("cnt"));
		System.out.println("execute:"+(System.currentTimeMillis()-begin));
	}
	
	public void insertDB2(){
		long begin = System.currentTimeMillis();
		Map<String,Object> map = db2.queryForMap("select count(*) cnt from user ");
		System.out.println("insertDB2 jdbcTemplate:"+db2+" cnt:"+map.get("cnt"));
		System.out.println("execute:"+(System.currentTimeMillis()-begin));
	}

	public JdbcTemplate getMysql() {
		return mysql;
	}

	public void setMysql(JdbcTemplate mysql) {
		this.mysql = mysql;
	}

	public JdbcTemplate getDb2() {
		return db2;
	}

	public void setDb2(JdbcTemplate db2) {
		this.db2 = db2;
	}
}
