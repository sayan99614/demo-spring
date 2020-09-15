package com.reference.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/reference/injection/config.xml");
		Student stud = (Student) context.getBean("student");
		
		System.out.println(stud);
		

	}

}
