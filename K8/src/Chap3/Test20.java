package Chap3;

import java.util.Scanner; // java.util.Scanner를 호출

public class Test20 { 
	public static void main(String[] args) {
//		int score = 90;
		Scanner in = new Scanner(System.in); // in 스캐너 정의
		int score = in.nextInt(); // int score 변수에 입력변수 값을 대입
		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("나의 점수는 = "+ grade);
	}
}
