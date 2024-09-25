package Chap3;

public class 중첩if문예제 {
	public static void main(String[] args) {
		int i = 6;
		if ((i % 2) == 0) {
			System.out.println(i + "는 2의 배수입니다.");
		}
		 if ((i % 3) == 0) {
			System.out.println(i + "는 3의 배수입니다.");
		}
	}
}
