package exam.examc4;



abstract class MediaBook {
	public 
}










public class ExamC4 {
	public static void main(String[] args) {

		Library<MediaBook> library = new Library<MediaBook>(); 

		// 5개의 item 객체 초기화 및 추가
		library.addItem(new Book("자바", "강감찬", 1995, "1234567890"));
		library.addItem(new Book("파이썬", "이순신", 2008, "1234567891")); 
		library.addItem(new Book("자바스크립트", "을지문덕", 2008, "1234567892"));
		library.addItem(new Book("자료구조", "연개소문", 1994, "1234567893")); 
		library.addItem(new Book("리액트", "김춘추", 1999, "1234567894"));		
		library.addItem(new CDBook("노래1", "나훈아", "3333"));
		library.addItem(new CDBook("노래2", "남진", "2222"));
		library.addItem(new CDBook("노래3", "홍길동", "1111"));
		library.addItem(new USBBook("데이터1", 2000, "ABCD1234"));
		library.addItem(new USBBook("데이터2", 1000, "ABCD1235"));
		library.addItem(new USBBook("데이터3", 3000, "ABCD1235"));
		
		library.printItems();
		System.out.println("=".repeat(80));

		library.removeBook();
		library.removeBook();
		library.removeBook();
		library.printItems();
	}
}
