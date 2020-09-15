package com.reference.injection;

public class Student {
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", roll=" + roll + "]";
	}

	private String name;
	private int age;
	private Roll roll;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Roll getRoll() {
		return roll;
	}

	public void setRoll(Roll roll) {
		this.roll = roll;
	}

	
	
	

}
