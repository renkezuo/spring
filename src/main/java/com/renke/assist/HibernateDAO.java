package com.renke.assist;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.renke.pojo.User;

public class HibernateDAO {
	private HibernateTemplate template;
//	private SessionFactory factory;

	public void insertUser(User user){
		System.out.println(template.getSessionFactory() instanceof LocalSessionFactoryBean);
		System.out.println(template.getSessionFactory() instanceof SessionFactory);
		System.out.println("save user");
//		factory.openSession().save(user);
		template.save(user);
	}
	
	public User findUser(){
		User user = new User();
		user.setId(80010);
		return template.findByExample(user).get(0);
	}

//	public SessionFactory getFactory() {
//		return factory;
//	}
//
//	public void setFactory(SessionFactory factory) {
//		this.factory = factory;
//	}
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
}
