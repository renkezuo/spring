package com.renke.pojo;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 * serialVersionUID
	 * @author renke.zuo@foxmail.com
	 * @time 2016-09-13 11:19:04 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String contact;
	private String password;
	private int sex;
	private String realName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
}
