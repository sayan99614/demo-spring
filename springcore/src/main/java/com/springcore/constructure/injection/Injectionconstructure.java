package com.springcore.constructure.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Injectionconstructure {
	
	public static void main(String []args) {
		
		ApplicationContext  context=new ClassPathXmlApplicationContext("com/springcore/constructure/injection/config.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
	}

}
