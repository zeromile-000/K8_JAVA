package com.ruby.java.ch13.Test;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {
	public static void main(String[] args) {
		Integer[] inum = {1,2,3,4,5}; //정수형 inum 필드 정의
		Double[] dnnm = {1.0,2.0,3.0,4.0,5.0}; //Dounle형 dnum 필드 정의
		String[] snum = {"1","2","3","4","5"}; //문자형 snum 필드 정의
		 		
		List<Integer> iList = Arrays.asList(inum); // 정수형 타입 iList 배열 변수에 inum 대입 
		List<Double> dList = Arrays.asList(dnnm); // Dounle형 dList 배열 변수에 dnum 대입
		List<String> sList = Arrays.asList(snum); //문자형 sList 배열 변수에 snum 대입
		
		double isum = sum(iList); 
		double dsum = sum(dList);
		// sum(sList); // 오류 발생
		
		System.out.println("inum의 합계 : " + isum);
		System.out.println("dsum의 합계 : " + dsum);
	}
	
	public static double sum(List<? extends Number> list) {
		double total = 0;
		for(Number v : list) {
			total += v.doubleValue();
		}
		return total;
	}
}
