package com.renke.assist;

import com.renke.pojo.User;

public class HibernateService {
	HibernateDAO dao ;
	
	public void insert(){
		User user = new User();
		user.setId(880012);
		user.setContact("123");
		user.setPassword("xixi");
		user.setSex(1);
		user.setRealName("����");
		dao.insertUser(user);

		User user2 = new User();
		user.setId(880013);
		user.setContact("123");
		user.setPassword("xixi");
		user.setSex(13333);
		user.setRealName("����");
		dao.insertUser(user2);
		
		System.out.println("insert User");
	}
	
	
	public User findUser(){
		return dao.findUser();
	}
	
	public HibernateDAO getDao() {
		return dao;
	}

	public void setDao(HibernateDAO dao) {
		this.dao = dao;
	}
}
