package Chap6;


class Student {
	private String name;
	private String[] criteria;
	private int[] scores;
	private String[] subject;
	
	average(){
		
	}
	sumScore(){
		
	}
	isPassed(){
		
	}
	studentPrint(Student[] students){
		
		
	}
}

public class 실습6_4번문제 {
	public static void main(String[] args) {
		String[] subjects = { "수학", "국어", "영어", "과학", "역사" };
		int[] criteria = { 50, 60, 70, 80, 80 };
		Student[] students = {new Student("홍길동",subjects,criteria, new int[] {85,90,78,88,72}),
				new Student("홍길동",subjects,criteria, new int[] {85,90,78,88,72}),
				new Student("홍길동",subjects,criteria, new int[] {85,90,78,88,72}),
				new Student("홍길동",subjects,criteria, new int[] {85,90,78,88,72}),
				new Student("홍길동",subjects,criteria, new int[] {85,90,78,88,72});

				}
				}

}
