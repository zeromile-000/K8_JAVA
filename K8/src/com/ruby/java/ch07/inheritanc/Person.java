package com.ruby.java.ch07.inheritanc;

public class Person {
	private String name;
	private int age;
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//		// TODO Auto-generated constructor stub
//	}
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
	public String toString( ) {
		return name + " : " + age;
	}
	
}
