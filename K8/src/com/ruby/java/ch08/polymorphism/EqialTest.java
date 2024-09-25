package com.ruby.java.ch08.polymorphism;

class DD{
	String name;
	
	public DD(String name) {
		this.name = name;
	}
	public boolean equals(Object obj) {
		DD d = (DD)obj; // 형변환을 진행
		if(name.equals(d.name))
			return true;
		return false;
	}
}

public class EqialTest {
	public static void main(String[] args) {
		DD a = new DD("A");
		DD b = new DD("B");
		DD c = new DD("A");
		DD d = a;
		
		System.out.println((a==b)?"equal" : "not equal");
		System.out.println((a==c)?"equal" : "not equal");
		System.out.println((a==d)?"equal" : "not equal"); //a
		
		System.out.println((a.equals(b))?"equal" : "not equal"); // a와 b가 가르키는 주솟값이 같냐?
		System.out.println((a.equals(c))?"equal" : "not equal"); // a와 c가 가르키는 주솟값이 같냐?

	}
}
