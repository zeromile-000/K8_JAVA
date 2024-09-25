package Chap2;

import java.util.Scanner;

public class examA1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("과목: ");
		String subject = sc.nextLine();
		System.out.print("성적: ");
		int score = sc.nextInt();
		String t1 = "";
		if(score>=60) {
			t1 = "합격";
		} else{
			t1 = "과락";
		}
		
		System.out.println("이름 = "+ name +", "+ "과목 = "+ subject +", "  + "성적 = "+ score +", "+"통과 = "+ t1);
		//System.out.printf("이름 = %s, 과목 = %s, 성적 = %d, 통과 = %s",name,subject,score,t1);
		
		
		
		
		//System.out.printf("이름: %s\n", name);
		//System.out.printf("과목: %s\n", subject);
		//System.out.printf("성적: %d\n", score);
		
		
		//if()
		sc.close();
	} 
	
}
