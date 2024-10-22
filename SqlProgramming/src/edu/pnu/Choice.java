package edu.pnu;

import java.util.Scanner;
import edu.pnu.*;

public class Choice {
	public static void main(String[] args) {
		QueryPrepareStatement pr = new QueryPrepareStatement();
		queryStatment st = new queryStatment();
		Scanner scm = new Scanner(System.in); // 스캐너 생성
		System.out.println("선택하시오 : ");
		int num = scm.nextInt();

		
		if(num == 1) {
			pr.main(null);
		}
		else if(num == 2) { 
			st.main(null);
			
		}
		
//		switch (num) {
//			case 0:
//				break;
//			case 1:
//				pr.main(null);
//				break;
//			case 2:
//				st.main(null);
//				break;
//			}
		}

	}

