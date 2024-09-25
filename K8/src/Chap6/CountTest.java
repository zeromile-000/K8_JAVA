package Chap6;

class Count {
	public static int totalCount;
	int count;
}

public class CountTest {
	private static int totalCount;
	private int count;

	public static void main(String[] args) {
		// System.out.println("실행 시작");
		CountTest c1 = new CountTest();
		CountTest c2 = new CountTest();
		CountTest c3 = new CountTest();

		c1.count++;
		CountTest.totalCount++;
		c2.count++;
		CountTest.totalCount++;
		c3.count++;
		CountTest.totalCount++;

		System.out.println(CountTest.totalCount + " : " + c1.count);
		System.out.println(CountTest.totalCount + " : " + c2.count);
		System.out.println(CountTest.totalCount + " : " + c3.count);
	}

}