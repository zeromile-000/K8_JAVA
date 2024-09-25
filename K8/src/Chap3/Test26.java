package Chap3;

public class Test26 {
	public static void main(String[] args) {
		int i = 0;
		// while(i<10) {
		while (true) {
			System.out.println(i);
			i++;
			if (i >= 10)
				break;
		}
		System.out.println("ok");
	}
}
