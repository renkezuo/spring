package com.renke.assist;

public class MybatisService {
	
	UserMapper userMapper;
	
	public void getUser(){
		System.out.println(userMapper.getUser(880008).getId());
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
}
