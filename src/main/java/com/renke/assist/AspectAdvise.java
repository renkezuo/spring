package com.renke.assist;

public class AspectAdvise {
	public void before(){
		System.out.println("I'm before");
	}
	public void afterReturn(){
		System.out.println("I'm afterReturn");
	}
	public void afterThrow(){
		System.out.println("I'm afterThrow");
	}
	public void after(){
		System.out.println("I'm after");
	}
	public void around(){
		System.out.println("I'm around");
	}
}
