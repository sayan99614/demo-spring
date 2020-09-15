package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("com/main/bean.xml");
		Studentdao studentdao = context.getBean("studentdao",Studentdao.class);
		
		Student student=new Student();
		
		student.setId(99);
		student.setName("sayan pati");
		student.setAge(21);
		
		int result = studentdao.insert(student);
		
		System.out.println(result+"record inserted");
		

	}

}
