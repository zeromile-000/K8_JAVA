package com.ruby.java.ch07.abstraction;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
	
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 판매 수당");
	}
	
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}


class Manger extends Employee {
	public void calcSalary() {
		System.out.println("Manger 급여 = 기본급 + 팀 성과 수당");
		}
	
	public void calcBonus() {
		System.out.println("Manger 보너스 = 기본급 * 12 * 6");
	}
}

class Director extends Manger{
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}


public class HRSTest {
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Manger m = new Manger();
		
		//s.calcSalary();
		//c.calcSalary();
		//m.calcSalary();
		s.calcBonus();
		c.calcBonus();
		m.calcBonus();
	}
}
