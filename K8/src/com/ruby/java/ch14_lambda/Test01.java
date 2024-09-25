package com.ruby.java.ch14_lambda;

interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface{
	@Override
	public void print() {
		System.out.println("myclass1");
	}
}
public class Test01 {
	static void test(MyInterface m) {
		m.print();
	}
	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();
		mc1.print();
		
		MyInterface mi = new MyInterface() { //익명클래스로 인터페이스의 클래스를 만들었다.
			@Override
			public void print() {
				System.out.println("익명클라스");
			}
			
		};
		mi.print();
	}
	

}
