package com.renke.template.aspect;

public class Target {
	public void target() throws NullPointerException{
		System.out.println("I'm Target Class");
		throw new NullPointerException();
	}
}
