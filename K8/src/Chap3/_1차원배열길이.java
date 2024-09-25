package Chap3;

public class _1차원배열길이 {
	public static void main(String[] args) {
		String[][] arr = { { "A", "B" }, { "C", "D" }, { "E", "F" } };
		int rowCount = arr.length; // arr의 행의 크기
		System.out.println("행의 길이 : " + rowCount); 
		int columnCount = arr[0].length; // arr의 열의크기
		System.out.println("열의 길이 : " + columnCount);
		System.out.println("전체 원소의 개수 : " + (rowCount * columnCount)); //arr의 총 길이
	}

}