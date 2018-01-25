package com.renke.scan;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerScan {

	public String name = "Controller" ;
	
	@Autowired
	private ComponentScan componentScan;
	@Resource
	private ServiceScan serviceScan;
	@Autowired
	@Qualifier("repositoryScan")
	private RepositoryScan repositoryScan;
	
	public void printComponent(){
		System.out.println(componentScan.name);
	}
	
	public void printRepository(){
		System.out.println(serviceScan.name);
	}
	
	public void printService(){
		System.out.println(repositoryScan.name);
	}
	
	
	public void callAllPrint(){
		printComponent();
		printRepository();
		printService();
	}
	
}
