package Chap6;

public class StaticMethodTest {
	int num = 123; // 일반변수이기 때문에 new 키워드를 사용하여 인스턴스를 만든후에야 사용이 가능하다.

	public static void main(String[] args) {

		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2("!");

	}

	public static void print1() {
		// int num2 = num; // Static에서는 Static에 있는것만 사용가능.
		System.out.println("hello");
	}

	public void print2(String a) {
		int num3 = num;
		System.out.println("java" + a);
	}

}
