package com.renke.assist;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.renke.pojo.User;

public class HibernateDAO {
	private HibernateTemplate template;

	public void insertUser(User user){
		System.out.println("save user");
		template.save(user);
	}
	
	public User findUser(){
		User user = new User();
		user.setId(80010);
		return template.findByExample(user).get(0);
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
}
