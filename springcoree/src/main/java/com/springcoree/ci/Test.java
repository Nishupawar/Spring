package com.springcoree.ci;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcoree/ci/CIconfig.xml");
		
		Person p = (Person)context.getBean("person");	
		System.out.println(p);
		
		Addition a =(Addition) context.getBean("add");
		a.doSum();
		
		Stringg s= (Stringg) context.getBean("str");
		s.doStr();
		
	}

}
