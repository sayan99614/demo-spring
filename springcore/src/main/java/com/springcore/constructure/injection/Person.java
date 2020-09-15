package com.springcore.constructure.injection;

import java.util.List;

public class Person {
	
	private String name;
	private int age;
	private String job;
	private Collage clg;
	private List<String> list;
	
	
	public Person(String name, int age, String job,Collage clg,List<String> list) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.clg=clg;
		this.list=list;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + ", clg=" + clg.getCollage() +list+"]";
	}
	
	
}
