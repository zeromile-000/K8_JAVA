package Chap1;

import java.util.*;
public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름");
		String name = sc.next();
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.println("이름 : 김준영" + name);
		System.out.println("생년월일 : 2020.0101" + age);
		System.out.println("생년월일 : 1999.0920");
		System.out.println("학교 : 동의대학교");
		System.out.println("학과 : 경영정보학과");
		System.out.println("입학 : 2018년");
		
		sc.close();
	}

}
