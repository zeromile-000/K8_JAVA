package com.ruby.java.ch09;

import java.util.StringTokenizer;

public class Test14 {
	public static void main(String[] args) {
		String msg = "I love you, you love me";
		StringTokenizer st1 = new StringTokenizer(msg);
		System.out.println("단어수 = "+ st1.countTokens());
		
		while(st1.hasMoreElements()) { // 토큰이 남아 있다면 실행문 수행, 없다면 실행하지 않는다.
			System.out.println("남아 있는 토큰 수 = " + st1.countTokens()); // 남아있는 토큰 수 반환
			System.out.println(st1.nextToken()); // 커서가 가르키는 String 타입을 반환
		}
	}
}
