package com.cts.ci.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ci.service.GreetService;

public class CiApp02 {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		GreetService gs=(GreetService) context.getBean("g1");
		System.out.println(gs.greet("vicky"));
	}

}
