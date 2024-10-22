package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class queryStatment {

	private static Scanner sc = new Scanner(System.in); // 스캐너 생성

	public static void main(String[] args) {
		Connection con = null; // Connection객체 생성 con 변수 null로 초기화
		Statement st = null; // st상태 객체를 null로 초기화
		try { // 시도
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "tiger"); // con에 jdbc 드라이버 연결
//			while(true) {
				System.out.println("질의의 번호를 입력하시오 : ");
				int num = sc.nextInt();
//				if(num == 0)
//					break;
				switch (num) {
					case 0:
						System.out.println("끝~~~~");
						return;
					case 1: 
						queryStatment1(st, con); 
						break;
					case 2: 
						queryStatment2(st, con); break;
					case 3: 
						queryStatment3(st, con); break;
					 
					case 4: 
						queryStatment4(st, con); break;
					 
					case 5: 
						queryStatment5(st, con); break;
					 
					case 6: 
						queryStatment6(st, con); break;
					 
					case 7: 
						queryStatment7(st, con); break;
					 

				}
			
//			queryStatment1(st, con); // queryStatment메서드를(st, con)을 파라미터로 넘겨주면서 호출
//			queryStatment2(st, con);
//			queryStatment3(st, con);
//			queryStatment4(st, con);
//			queryStatment5(st, con);
//			queryStatment6(st, con);
//			queryStatment7(st, con);
			
//			}
			
			} catch(Exception e) { // try에서 에러가 발생하면 
			System.err.println("연결실패 :" + e.getMessage()); // 연결실패를 출력과 동시에 에러 요인을 함께 출력
		} finally { // try와 catch 결과와는 관계없이 실행
			try { // 
				if (con != null) // con이 연결되어 있으면 
					con.close(); // con을 닫는다.
			} catch (SQLException e) {} // sql 에러를 잡는다.
		}
	}
		
		

	// 1. 인구 수를 입력 받아서 그보다 많은 인구를 가진 도시를 검색해서 출력하세요.
	private static void queryStatment1(Statement st, Connection con) { // con 매개변수를 받아서 실행
		ResultSet rs = null; // rs
		try {
			System.out.print("인구수 : ");
			int val = sc.nextInt();

			st = con.createStatement(); // con 객체가 연결되어있는 jdbc 드라이버 정보를 st에 대입
			rs = st.executeQuery("select * from city where population > " + val); // 쿼리 질의문의 결과를 rs에 저장

			while (rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getInt("Id") + ",");
				System.out.print(rs.getString("Name") + ",");
				System.out.print(rs.getString("CountryCode") + ",");
				System.out.print(rs.getString("District") + ",");
				System.out.print(rs.getInt("population") + "\n");
			}
		} catch (Exception e) {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e1) {
			}
		}
	}

//		2. 국가 명의 일부 또는 국가 코드를 입력 받아서 해당 국가의 도시의 이름과 인구를 검색해서 출력하세요.
	private static void queryStatment2(Statement st, Connection con) { // con 매개변수를 받아서 실행
		ResultSet rs = null; // rs
		try {
			System.out.print("국가명 or 국가 코드 : ");
			String val = sc.nextLine();

			st = con.createStatement(); // con 객체가 연결되어있는 jdbc 드라이버 정보를 st에 대입
			rs = st.executeQuery("select Name, Population from city where CountryCode = '" + val + "'");
			while (rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("name") + ",");
				System.out.print(rs.getInt("population") + "\n");
			}
		} catch (Exception e) {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e1) {
			}
		}
	}

//		3. 대륙을 입력 받아서 해당 대륙에 위치한 국가를 검색해서 출력하세요. (Continent)
	private static void queryStatment3(Statement st, Connection con) { // con 매개변수를 받아서 실행
		ResultSet rs = null; // rs
		try {
			System.out.print("대륙명 입력 : ");
			String val = sc.nextLine();

			st = con.createStatement(); // con 객체가 연결되어있는 jdbc 드라이버 정보를 st에 대입
			rs = st.executeQuery("select Name from country where Continent = '" + val + "'");
			while (rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("name") + "\n");

			}
		} catch (Exception e) {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e1) {
			}
		}
	}

//		4. 넓이(10,0002 km)를 입력 받아서 입력 값보다 작은 면적을 가진 국가의 이름과 면적을 면적 오름차순으로 검색해서 출력하세요.
	private static void queryStatment4(Statement st, Connection con) { // con 매개변수를 받아서 실행
		ResultSet rs = null; // rs
		try {
			System.out.print("넓이 입력 : ");
			int val = sc.nextInt();

			st = con.createStatement(); // con 객체가 연결되어있는 jdbc 드라이버 정보를 st에 대입
			rs = st.executeQuery("select Name, SurfaceArea  from country where SurfaceArea < " + val
					+ " order by Name, SurfaceArea ASC");
			while (rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("name") + ", ");
				System.out.print(rs.getInt("SurfaceArea") + "\n");

			}
		} catch (Exception e) {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e1) {
			}
		}
	}

//		5. 대한민국의 District를 입력 받아서 해당 지역에 있는 모든 도시를 검색해서 출력하세요. (예:‘Kyonggi’)
	private static void queryStatment5(Statement st, Connection con) { // con 매개변수를 받아서 실행
		ResultSet rs = null; // rs
		try {
			System.out.print("대한민국의 District를 입력 : ");
			String val = sc.nextLine();

			st = con.createStatement(); // con 객체가 연결되어있는 jdbc 드라이버 정보를 st에 대입
			rs = st.executeQuery("select Name, CountryCode from city where District = '" + val + "'");
			while (rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("name") + ", ");
				System.out.print(rs.getString("CountryCode") + "\n");

			}
		} catch (Exception e) {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e1) {
			}
		}
	}

//		6. 언어를 입력 받아서 해당 언어가 국가 공식 언어인 국가를 검색해서 출력하세요. (예:'Spanish’)
	private static void queryStatment6(Statement st, Connection con) { // con 매개변수를 받아서 실행
		ResultSet rs = null; // rs
		try {
			System.out.print("언어를 입력 : ");
			String val = sc.nextLine();

			st = con.createStatement(); // con 객체가 연결되어있는 jdbc 드라이버 정보를 st에 대입
			rs = st.executeQuery(
					"SELECT Name FROM countrylanguage A join country B on a.CountryCode = b.Code where Language = '"
							+ val + "'");
			while (rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("name") + "\n");

			}
		} catch (Exception e) {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e1) {
			}
		}
	}

//		7. CountryLanguage에서 사용자가 입력 비율 이상인 언어의 국가 코드와 비율을 검색해서 출력하세요
	private static void queryStatment7(Statement st, Connection con) { // con 매개변수를 받아서 실행
		ResultSet rs = null; // rs
		try {
			System.out.print("사용자 입력비율 이상 입력 : ");
			int val = sc.nextInt();

			st = con.createStatement(); // con 객체가 연결되어있는 jdbc 드라이버 정보를 st에 대입
			rs = st.executeQuery("select CountryCode, Percentage from countrylanguage where Percentage > " + val
					+ " order by Percentage asc");
			while (rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("CountryCode") + ",  ");
				System.out.print(rs.getFloat("Percentage") + "%" + "\n");

			}
		} catch (Exception e) {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e1) {
			}
		}
	}

}
