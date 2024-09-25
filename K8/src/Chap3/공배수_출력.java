package Chap3;

public class 공배수_출력 {
	public static void main(String[] args) {
		int Total = 0;
		for (int i = 1; i < 100; i++) {
			if ((i % 2) == 0 && (i % 3) == 0) {
				Total++;
				System.out.println(i + "는 2와 3의 공배수입니다");
//				int Total = Count(i)
				// if((i%3)==0) {
				// System.out.println(i+"은 3의 배수입니다");
			}
		}
		System.out.println("2와 3의 공배수의 총개수는" + Total + "입니다.");
	}
}