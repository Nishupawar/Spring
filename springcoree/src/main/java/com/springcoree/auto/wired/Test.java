package com.springcoree.auto.wired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
   public static void main(String[] args) 
    {
	
	ApplicationContext context =new ClassPathXmlApplicationContext("com/springcoree/auto/wired/AutoConfig.xml");
	 Employee emp=(Employee)context.getBean("emp");
	 System.out.println(emp);
	 
	 
    }
}
