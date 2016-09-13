package com.renke.template;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MsgBean  implements InitializingBean,DisposableBean{
	public void showMsg(String msg){
		System.out.println(msg);
	}
	public void initialize(){
		System.out.println("initialize");
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		initialize();
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}
}
