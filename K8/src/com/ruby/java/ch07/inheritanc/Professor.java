package com.ruby.java.ch07.inheritanc;

public class Professor extends Person{
	private String subject;

	public Professor(String name, int age, String subject) {
		super.setName(name);
		super.setAge(age);
		this.subject = subject;
		System.out.println("Professor(name, age, subject) 생성자 실행 !");
	}

	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
//	public String toString() {
//		return getName() + " : " + getAge() + " : " + subject;	
//    }
	public String toString() {
		return super.toString() + " : " + subject;
	}
}