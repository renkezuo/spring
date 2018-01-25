package com.renke.entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.renke.scan.ControllerScan;
import com.renke.template.IOCBean;

public class BaseEntry {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(new String[] {"spring-base.xml"});
		Object obj = context.getBean("controllerScan");
		ControllerScan cc = (ControllerScan)obj;
		cc.callAllPrint();
//		obj = context.getBean("before");
//		Before before = (Before)obj;
//		before.before();
//		obj = context.getBean("within");
//		Within within = (Within)obj;
//		within.within();
//		obj = context.getBean("this");
//		This t = (This)obj;
//		t.thisFun();
//		obj = context.getBean("target");
//		Target target = (Target)obj;
//		try{
//			target.target();
//		}catch (Exception e){
//			System.out.println("do nothing");
//		}
//		obj = context.getBean("args");
//		Args args2 = (Args)obj;
//		args2.args("args");
//		System.out.println(Args.i);
	}
}
