package com.springcoree.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/springcoree/standalone/collections/standaloneConfig.xml");       
        
        Person person = (Person) context.getBean("person1");
      
        System.out.println(person);
        System.out.println(person.getFriend().getClass().getName());
        System.out.println("_______________________________________________________________________________________________");
        System.out.println(person.getFeeStructure() );
        System.out.println(person.getFeeStructure().getClass().getName());
        System.out.println("_______________________________________________________________________________________");
        System.out.println(person.getProp());
        System.out.println(person.getProp().getClass().getName());
        
    }
}
