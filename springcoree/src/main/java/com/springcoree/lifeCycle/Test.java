package com.springcoree.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcoree/lifeCycle/lifeCycleConfig.xml");
	Samosa s=(Samosa) context.getBean("s1");
	System.out.println(s);
	
	context.registerShutdownHook();
	System.out.println("****************************");
	
	Pepsi p= (Pepsi) context.getBean("p1");
	System.out.println(p);
	
	System.out.println("****************************");
	
	
	Example e= (Example)context.getBean("ex");
	System.out.println(e);
}
}
