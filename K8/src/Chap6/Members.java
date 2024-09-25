package Chap6;

public class Members {
	private String name;
	private int age;

	public Members() {
		this("guest");
		// System.out.println("Member( ) 생성자 실행");
	}

	public Members(String name) {
		this(name, 0);
//		System.out.print("Member(String) 생성자 실행 : ");
//		System.out.println(name);
	}

	public Members(String name, int age) {
		this.name = name;
		this.age = age;
//		System.out.print("Members(String, int) 생성자 실행 : ");
//		System.out.println(name + " : " + age);
	}

	public String toString() {
		return name + " : " + age;
	}

	public static void main(String[] args) {
//		System.out.println("main() 메서드 실행");

		Members m1 = new Members();
		Members m2 = new Members("Amy");
		Members m3 = new Members("Amy", 23);

		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
}
