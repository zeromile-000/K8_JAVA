package Chap3;

public class Test23 {
	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("90점 이상");
			break;
		case 'B':
			System.out.println("80점 이상");
			break;
		case 'C':
			System.out.println("70점 이상");
			break;
		case 'D':
			System.out.println("60점 이상");
			break;
		default:
			System.out.println("60점 미만");
			break; // 60점 미만일 경우 default문 실행 후 탈출
		}
	}
}
