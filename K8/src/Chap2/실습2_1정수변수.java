package Chap2;

import java.util.Scanner;

public class 실습2_1정수변수 {
	public static void main(String[] args) {

		// 정수형에서 실수형으로 변환 (묵시적 형 변환)
		Scanner sc = new Scanner(System.in); // Scanner 입력변수 선언
		int num = sc.nextInt(); // 정수형 num에 sc.nextInt() 입력받은 데이터 대입
		float exchabgeRate = 1136.50f; // float 실수형 선언 및 1136.50f로 초기화 f를 사용하지 않을 경우 데이터 변환 오류 발생!
		double dnum = num; // 더블형 dnum변수 선언 및 정수형 num 대입
		System.out.println("num = " + num + ", dnum = " + dnum);

		/*
		 * 
		 * 정수형 변수를 화면에서 입력받아 double 변수로 변환하여 출력하는 코드를 작성한다.
		 * 
		 * 출력은 "num = **, double = **"
		 * 
		 */

		// 실수형에서 정수형으로 변환 (명시적 형 변환)
		float t1 = 1.1f;// t1을 실수형 변수로 선언
		int t2 = (int) t1;
		System.out.println("tl = " + t1 + ", t2 = " + t2);
		sc.close();
		/*
		 * 
		 * 실수형 변수 값을 화면에서 입력받아 정수로 변환하는 코드를 작성한다.
		 * 
		 * 출력은 "실수변수값 = **, 정수변수값 = **
		 * 
		 */

	}
}

