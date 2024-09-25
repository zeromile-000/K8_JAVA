package com.ruby.java.ch08.polymorphism;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee { // Salesman 클래스는 추상클래스를 Employee 클래스의 본문을 정의해야 함.
	int annual_sales;
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");

	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	int num_project;
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 *  12 * 2");

	}
}

class Manager extends Employee {
	int num_team;
	public void calcSalary() {
		System.out.println("Mananger 급여 = 기본급 + 팀 성과 수당");
	}

	public void calcBonus() {
		System.out.println("Mananger 보너스 = 기본급 *  12 * 6");
	}
}

class Director extends Manager {
	public void calcSalary() {
		System.out.println("Director 급여 = 기본급 + 팀 성과 수당");
	}
}

public class HTSTest {
//			public static void calcTax(HTSTest e) {
//				System.out.println("소득세를 계산합니다.");
//			}
	public static void calcTax(Employee e) { 
		if (e instanceof Salesman) {
			Salesman s = (Salesman) e; //클래스 타입으로 형변환
				s.annual_sales = 6500000; 
			System.out.println("Salesman 입니다. "+ s.annual_sales);
		} else if (e instanceof Manager) {
			Manager m = (Manager) e;
			m.num_team=5;
			System.out.println("Manager 입니다. "+m.num_team);
		} else if (e instanceof Consultant) {
			Consultant c = (Consultant) e;
			c.num_project = 35;
			System.out.println("Consultant 입니다. "+ c.num_project);
		} else {
			System.out.println("Employee 입니다.");
		}
	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();
//			Director d = new Director();

//			Salesman s1 = new Salesman();
//			Salesman s2 = new Salesman();
//			Object s3 = new Salesman();
//			
//			Object m1 = new Manager();
//			Manager m2 = new Manager();
//			Manager m3 = new Manager();

//			Object arr[] = new Object[6];
//			arr[0] = s1;
//			arr[1] = s2;
//			arr[2] = s3;
//			arr[3] = m1;
//			arr[4] = m2;
//			arr[5] = m3;
//			
//			for(int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i]);
//			}

//			System.out.println(s.toString());
//			System.out.println(c.toString());
//			System.out.println(d.toString());
//			
//			if(s.equals(c)) {
//				System.out.println("동일한 객체입니다.");
//			} else {
//				System.out.println("서로 다른 객체입니다.");
//			}

//			s.calcBonus();
//			c.calcBonus();
//			d.calcBonus();
//		
		calcTax(s);
		calcTax(m);
		calcTax(c);
	}
}
