package com.ruby.java.ch13.Test;

public class GenMethodTest2 {
	 <T extends Number, V extends T> boolean isInclude(T num, V[] array) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Integer[] inum = {1,2,3,4,5}; //정수형 inum 필드 정의
		Double[] dnnm = {1.0,2.0,3.0,4.0,5.0}; //Dounle형 dnum 필드 정의
		String[] snum = {"one","two","three","four","five"}; //문자형 snum 필드 정의
		
		GenMethodTest2 gt = new GenMethodTest2();
		
		boolean b1 = gt.isInclude(3, inum);
		System.out.println("결과 : " + b1);
		
		boolean b2 = gt.isInclude(5.0, dnnm);
		System.out.println("결과 : " + b2);
		
		
		
		// isInclude("one", snum);
		
//		GenMethodTest2.<Integer, Integer>isInclude(3, inum);
//		GenMethodTest2.<Double, Double>isInclude(5.0, dnnm); // double 데이터는 "="비교가 안된다.
//		//GenMethodTest.<String, String>isInclude("one", snum);
//		
		
		
		
	}

}
