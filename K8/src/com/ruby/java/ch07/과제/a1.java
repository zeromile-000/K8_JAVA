package com.ruby.java.ch07.과제;

class Person {
	private String name; // 이름
	private int age; // 나이
	private float weight; // 몸무게
	private String[] subjects; //교육 과목
	private int[] years; // 수강 연도
	int count = 0; // 배열 인덱스
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
	public void setYears(int[] years) {
		this.years = years;
	}
	
	void show() { // 4. 아래 문장 출력
		System.out.println("name= " + name + ", " + "age= "+ age+ ", "+"weight= "+ weight);
		int i = 0;
		while(i<subjects.length) {
			System.out.println("교육과목 = "+subjects[i]+", "+"수강연도 = "+ years[i]);
			i++;
		}
		System.out.println("=".repeat(40));
	}

	void addSubjectYear(String subject, int year) {
		for(int i=0;i<subjects.length;i++) { 
			subjects[count++] = subject;
			years[count++] = year;
		}
	}
	
}

public class a1 {
	public static void main(String[] args) {
		Person p1 = new Person(); // 1. 첫 번째 객체 생성 및 초기화 
		p1.setName("홍길동"); // 2. 필드에 값 대입
		p1.setAge(25);
		p1.setWeight(60.56f);
		p1.setSubjects(new String[] { "Mathematics", "Science", "History" }); //배열도 ( )를 사용해줘야 한다.
		p1.setYears(new int[] { 2020, 2021, 2022 });
		p1.show(); // 3. show( )메서드 호출

		// 두 번째 객체 생성 및 초기화
		Person p2 = new Person();
		p2.setName("강감찬");
		p2.setAge(55);
		p2.setWeight(62.34f);
		p2.setSubjects(new String[] { "Literature", "Philosophy", "Physics" });
		p2.setYears(new int[] { 2018, 2019, 2020 });
		p2.show();
	}
}
