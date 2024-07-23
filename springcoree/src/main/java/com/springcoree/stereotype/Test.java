package com.springcoree.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcoree/stereotype/steroeotypeConfig.xml");
	
	Student student = (Student)context.getBean("student");
	System.out.println(student);
	System.out.println(student.getCity().getClass().getName());
	System.out.println(student.getAdd().getClass().getName());
	Student student1 = (Student)context.getBean("student");
	System.out.println(student.hashCode());
	System.out.println(student1.hashCode());
	
	Teacher t=(Teacher) context.getBean("teacher");
	Teacher t2=(Teacher) context.getBean("teacher");
	System.out.println(t.hashCode());
	System.out.println(t2.hashCode());
	
}
}
