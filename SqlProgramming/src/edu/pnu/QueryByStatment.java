package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryByStatment {

	public static void main(String[] args) {
		Connection con = null; // 초기값 null로 초기화
		Statement st = null;
		ResultSet rs = null;
		try { // 
			Class.forName("com.mysql.cj.jdbc.Driver"); // jdbc driver 로딩 // 생략가능 
			String url = "jdbc:mysql://localhost:3306/world"; // url 주소 저장
			con = DriverManager.getConnection(url, "root", "tiger"); // driver 연결 // driver 자동연결됨
			st = con.createStatement(); // con 객체 생성
			rs = st.executeQuery("select id, name, countrycode, " + "district, population from city"); // 질의 쿼리 작성
			while(rs.next()) { // rs 객체의 데이터가 있는 동안 반복
				System.out.print(rs.getInt("id") + ","); // getType에 맞게 가져와라.
				System.out.print(rs.getString("name") + ",");
				System.out.print(rs.getString("countrycode") + ",");
				System.out.print(rs.getString("district") + ",");
				System.out.print(rs.getString("population") + "\n");
				
			}
		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		}finally {
			try {
				if(rs != null) rs.close();
				if(rs != null) st.close();
				if(rs != null) con.close();
				
			} catch (Exception e) {}
		}

	}

}
