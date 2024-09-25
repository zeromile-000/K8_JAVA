package Chap2;

import java.util.*;

public class 실습2_5명시적타입변환 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		double t2 = t1;
		System.out.println("정수변수값 = " + t1 + ", 실수변수값 = " + t2);
		int t3 = (int) t2;
		System.out.println("실수변수값 = " + t2 + ", 정수변수값 = " + t3);
		sc.close();

		// 정수형에서 실수형으로 변환 (묵시적 형 변환)

		/*
		 * 
		 * 정수형 변수를 화면에서 입력받아 double 변수로 변환하여 출력하는 코드를 작성한다.
		 * 
		 * 출력은 "정수변수값 = **, 실수변수값 = **"
		 * 
		 */

		// 실수형에서 정수형으로 변환 (명시적 형 변환)

		/*
		 * 
		 * 실수형 변수 값을 화면에서 입력받아 정수로 변환하는 코드를 작성한다.
		 * 
		 * 출력은 "실수변수값 = **, 정수변수값 = **
		 * 
		 */

	}
}