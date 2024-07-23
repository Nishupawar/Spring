package com.springcoree.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcoree/ref/refConfig.xml");
	
	A a=(A)context.getBean("aref");
	System.out.println("A"+a.getX());
	System.out.println("A_ob "+a.getObj());
	System.out.println(a.getObj().getY());
}
}
