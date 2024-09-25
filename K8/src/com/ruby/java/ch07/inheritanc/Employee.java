package com.ruby.java.ch07.inheritanc;

public class Employee extends Person{
	private String dept;
	
	public Employee(String name, int age, String dept) {
		super.setName(name);
		super.setAge(age);
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행 !");
	
	}

	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}



	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
//	public String toString() {
//		return getName() + " : " + getAge() + " : " + dept; 
//	}
	public String toString() {
		return super.toString() + " : " + dept;
	}
}
