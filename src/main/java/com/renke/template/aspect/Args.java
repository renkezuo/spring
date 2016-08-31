package com.renke.template.aspect;

public class Args {
	public static int i = 0;
	public void args(String msg){
		i++ ;
		System.out.println("I'm Args Class " + msg);
		System.out.println(i);
	}
}
