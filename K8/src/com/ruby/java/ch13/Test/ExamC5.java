package exam.examc4;

import java.util.ArrayList;
import java.util.List;

// MediaBook 클래스 (추상 클래스)
abstract class MediaBook {
    public abstract void printInfo();
}

// Book 클래스
class Book extends MediaBook {
    private String title;
    private String author;
    private int year;
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    @Override
    public void printInfo() {
        System.out.println("Book: " + title + " by " + author + ", " + year + " [ISBN: " + isbn + "]");
    }
}

// CDBook 클래스
class CDBook extends MediaBook {
    private String title;
    private String artist;
    private String serial;

    public CDBook(String title, String artist, String serial) {
        this.title = title;
        this.artist = artist;
        this.serial = serial;
    }

    @Override
    public void printInfo() {
        System.out.println("CDBook: " + title + " by " + artist + " [Serial: " + serial + "]");
    }
}

// USBBook 클래스
class USBBook extends MediaBook {
    private String title;
    private int size;
    private String serial;

    public USBBook(String title, int size, String serial) {
        this.title = title;
        this.size = size;
        this.serial = serial;
    }

    @Override
    public void printInfo() {
        System.out.println("USBBook: " + title + ", Size: " + size + "MB [Serial: " + serial + "]");
    }
}

// Library 클래스
class Library<T extends MediaBook> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeBook() {
        if (!items.isEmpty()) {
            items.remove(items.size() - 1);
        } else {
            System.out.println("No items to remove!");
        }
    }

    public void printItems() {
        for (T item : items) {
            item.printInfo();
        }
    }
}

// ExamC4 클래스
public class ExamC5 {
    public static void main(String[] args) {
        Library<MediaBook> library = new Library<>();

        // 항목 추가
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

        // 항목 출력
        library.printItems();
        System.out.println("=".repeat(80));

        // 항목 삭제 후 출력
        library.removeBook();
        library.removeBook();
        library.removeBook();
        library.printItems();
    }
}
