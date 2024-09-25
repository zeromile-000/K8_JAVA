package Chap3;

public class 구구단_가로_출력 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			//System.out.println(i);
			for (int j = 1; j < 10; j++) {
				//System.out.println(j);
				System.out.print(i + "*" + j + "=" + (i * j)+" ");
			}
			System.out.println("\n"); // 한 줄 바꿈
		}

	}
}
