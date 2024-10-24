package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class QueryExecuteUpdateInsert {
	private static Scanner sc = new Scanner(System.in); // 스캐너 생성
	public static void main(String[] args) {
		// 1. 데이터베이스 연결
		Connection con = null; // 연결객체 생성 및 초기값 null로 설정
		try {
			String url = "jdbc:mysql://localhost:3306/myfirstdb"; // url 변수 생성
			con = DriverManager.getConnection(url, "root", "tiger"); // DB 서버 접속
			
			// 메서드 호출
			queryExecuteUpdateInsert1(con); // Insert 구문 호출
			queryExecuteUpdateInsert2(con); // Update 구문 호출
			queryExecuteUpdateInsert3(con); // Delete 구문 호출

		} catch (Exception e) { // 오류 발생시 수행 
			System.out.println("연결실패 :" + e.getMessage()); // 연결실패 : + 오류 메세지 출력
		} finally { // 오류 발생여부와 관계없이 수행 
			try {
				if (con != null) //
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 자동 자원할당 해제 try-with-Exception 
//	try (){
//		
//	} catch(Exception e) {}
	
	// 2. 질의객체 생성
	private static void queryExecuteUpdateInsert1(Connection con) throws SQLException {
		try {
			String sql = "insert into phonebook(name, mobile) values(?,?)";
			PreparedStatement psmt = con.prepareStatement(sql);
			
			for(int i=0; i < 101; i++) {
				String name = "홍길동" + i ;
				String mobile = "010-9498-5686";
				psmt.setString(1, name);
				psmt.setString(2, mobile);
				psmt.executeUpdate();
			}
		} catch (Exception e) {}
	}
	
	private static void queryExecuteUpdateInsert2(Connection con) throws SQLException {
		try {
			String sql = "update phonebook set home = ?";
			PreparedStatement psmt = con.prepareStatement(sql);
			for(int i=0; i < 101; i++) {
				String home = "055-832-255" + i;
				psmt.setString(1, home);
				psmt.executeUpdate();
			}
		} catch (Exception e) {}
	}


	private static void queryExecuteUpdateInsert3(Connection con) throws SQLException {
		try {
			String sql = "delete from phonebook where id = ?";
			PreparedStatement psmt = con.prepareStatement(sql);
			for(int i = 101; i <201; i++) {
				int id = i;
				psmt.setInt(1, id);
				psmt.executeUpdate();
			}
		} catch (Exception e) {}
	}
}

