package Chap2;

public class 실습2_2원면적및둘레 {
	public static void main(String[] args) {
		double t1 = 0.0;
		double radius = 7.5;
		double area = 0.0;
		double circumference = 0.0;
		double pi = 3.14159;
		// 실수형 변수 선언 및 초기화

		/*
		 * 
		 * 원의 반지름 7.5를 변수 radius로 선언한다
		 * 
		 */

		area = pi * radius * radius;
		t1 = 2 * pi * radius;
		System.out.println("원의 면적 = " + area + ", 원의 둘레 = " + t1);

		// 원의 면적과 둘레 계산

		/*
		 * 
		 * 원의 면적은 area, 둘레는 circumference 변수에 저장한다.
		 * 
		 * 원 면적은 pi * r * r
		 * 
		 * 원 둘레는 2 * pi * r
		 * 
		 * pi 값은 3.14159로 사용하거나 Math.PI를 사용한다
		 * 
		 */

		// 결과 출력

		/*
		 * 
		 * 출력 형태는 다음과 같이 1줄에 출력한다.
		 * 
		 * "원의 면적 = **, 원의 둘레 = **"
		 * 
		 */

	}
}
