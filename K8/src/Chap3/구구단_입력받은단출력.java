package Chap3;

import java.util.*;

public class 구구단_입력받은단출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		//for (int i = 2; i < 10; i += t1) {
			for (int j = 1; j < 10; j++) {
				for (int k = 2; k < 10; k++) {
				System.out.print(k + "*"+ j + "=" + (k * j)+"\t");
					//if (j == t1){ break;
				}
				System.out.println();
			} 
			sc.close();
		} 
}


//		
