package com.renke.assist;


public class MysqlService {
	public MysqlDAO dao;

	public void insertDB2(){
		dao.insertDB2();
	}
	
	public MysqlDAO getDao() {
		return dao;
	}

	public void setDao(MysqlDAO dao) {
		this.dao = dao;
	}
	
}
