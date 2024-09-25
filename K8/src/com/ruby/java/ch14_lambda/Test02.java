package com.ruby.java.ch14_lambda;
interface Multiply {
	double getValue();
}

public class Test02 {
	static Multiply test4() {
		return new Multiply() {
			@Override
		public double getValue() {
				return 3.14159*2;
			}
	};

}


public static void main(String[] args) {
	Multiply m = () -> 3.14159 * 2;
	System.out.println(m.getValue());
}
