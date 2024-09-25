package com.ruby.java.ch07.inheritanc;

public class Student extends Person {
	private String major;

	public Student(String name, int age, String major) {
		super.setName(name);
		super.setAge(age);
		this.major = major;
		System.out.println("Student(name, age, major) 생성자 실행 !");
		// TODO Auto-generated constructor stub
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
//		public String toString() {
//			return getName() + " : " + getAge() + " : " + major;
//		}
	
	public String toString() {
		return super.toString() + " : " + major;
	}
	
}
