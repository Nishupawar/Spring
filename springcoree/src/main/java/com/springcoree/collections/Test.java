package com.springcoree.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	System.out.println("Hii");
	
	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcoree/collections/EmpConfig.xml");
	
	Employee emp=(Employee) context.getBean("emp");
	System.out.println(emp);
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.getAdd());
	System.out.println(emp.getCourses());
	System.out.println(emp.getProps());
	System.out.println(emp.getName().getClass().getName());
	System.out.println(emp.getAdd().getClass().getName());
	System.out.println(emp.getCourses().getClass().getName());
}
}
