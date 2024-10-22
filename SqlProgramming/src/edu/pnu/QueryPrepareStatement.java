package edu.pnu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class QueryPrepareStatement {
	
	private static Scanner sc = new Scanner(System.in); // 스캐너 생성
	
	public static void main(String[] args) {
		
		Connection con = null; // Connection객체 생성 con 변수 null로 초기화
		PreparedStatement st = null; // st상태 객체를 null로 초기화
		try { // 시도
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "tiger"); // con에 jdbc 드라이버 연결
			
			System.out.println("질의의 번호를 입력하시오 : ");
			int num = sc.nextInt();
//			if(num == 0)
//				break;
			switch (num) {
				case 0:
					System.out.println("끝~~~~");
					return;
				case 1: 
					QueryPrepareStatement1(st, con); 
					break;
				case 2: 
					QueryPrepareStatement2(st, con); break;
				case 3: 
					QueryPrepareStatement3(st, con); break;
				 
				case 4: 
					QueryPrepareStatement4(st, con); break;
				 
				case 5: 
					QueryPrepareStatement5(st, con); break;
				 
				case 6: 
					QueryPrepareStatement6(st, con); break;
				 
				case 7: 
					QueryPrepareStatement7(st, con); break;
				 

			}
			
//			QueryPrepareStatement1(st, con); // QueryPrepareStatement메서드를(st, con)을 파라미터로 넘겨주면서 호출
//			QueryPrepareStatement2(st, con);
//			QueryPrepareStatement3(st, con);
//			QueryPrepareStatement4(st, con);
//			QueryPrepareStatement5(st, con);
//			QueryPrepareStatement6(st, con);
//			QueryPrepareStatement7(st, con);
			
			
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
		private static void QueryPrepareStatement1(PreparedStatement st, Connection con) { // con 매개변수를 받아서 실행
			ResultSet rs = null; //  ResultSet 객체 초기화.
		try { // 도전!!!!!!!!
			System.out.print("인구수 : "); // "인구 수 : "출력
			int val = sc.nextInt(); // 정수형 val 변수에 sc.nextInt 정수형 입력변수 값 대입 
			
			PreparedStatement psmt = con.prepareStatement("select * from city where population > ?"); // PreparedStatement 객체 생성 및 con 연결객체 대입 
			psmt.setInt(1, val);
			rs = psmt.executeQuery(); // 쿼리 질의문의 결과를 rs에 저장
			
			while(rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getInt("Id")+",");  // 정수형 id 값을 가져오다. 
				System.out.print(rs.getString("Name")+","); // 문자열 Name 값을 가져오다. 
				System.out.print(rs.getString("CountryCode")+","); // 문자열 CountryCode 값을 가져오다.
				System.out.print(rs.getString("District")+","); // 문자열 District 값을 가져오다.
				System.out.print(rs.getInt("population")+"\n"); // 정수형 population 값을 가져오다.
			}
		} catch(Exception e) { // 오류 발생시 잡는다.
			try { // 
				if (rs != null) rs.close(); // rs 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
				if (st != null) st.close(); // st 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
			} catch(SQLException e1) {}
		}
	}
//		2. 국가 명의 일부 또는 국가 코드를 입력 받아서 해당 국가의 도시의 이름과 인구를 검색해서 출력하세요.
		private static void QueryPrepareStatement2(PreparedStatement st, Connection con) { // con 매개변수를 받아서 실행
			ResultSet rs = null; //  ResultSet 객체 초기화.
		try { // 도전!!!!!!!!
			System.out.print("국가명 or 국가 코드 : "); // "인구 수 : "출력
			String val = sc.nextLine(); // 문자열 val 변수에 sc.nextInt 정수형 입력변수 값 대입 
			
			PreparedStatement psmt = con.prepareStatement("select Name, Population from city where CountryCode = ?"); // PreparedStatement 객체 생성 및 con 연결객체 대입 
			psmt.setString(1, val);
			rs = psmt.executeQuery(); // 쿼리 질의문의 결과를 rs에 저장
			
			while(rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("Name")+","); // 문자열 Name 값을 가져오다. 
				System.out.print(rs.getInt("population")+"\n");  // 정수형 id 값을 가져오다. 

			}
		} catch(Exception e) { // 오류 발생시 잡는다.
			try { // 
				if (rs != null) rs.close(); // rs 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
				if (st != null) st.close(); // st 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
			} catch(SQLException e1) {}
		}
	}
		
		//3. 대륙을 입력 받아서 해당 대륙에 위치한 국가를 검색해서 출력하세요. (Continent)
		private static void QueryPrepareStatement3(PreparedStatement st, Connection con) { // con 매개변수를 받아서 실행
			ResultSet rs = null; //  ResultSet 객체 초기화.
		try { // 도전!!!!!!!!
			System.out.print("대륙을 입력 : "); // "인구 수 : "출력
			String val = sc.nextLine(); // 문자열 val 변수에 sc.nextInt 정수형 입력변수 값 대입 
			
			PreparedStatement psmt = con.prepareStatement("select Name from country where Continent = ?"); // PreparedStatement 객체 생성 및 con 연결객체 대입 
			psmt.setString(1, val);
			rs = psmt.executeQuery(); // 쿼리 질의문의 결과를 rs에 저장
			
			while(rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("Name")+","); // 문자열 Name 값을 가져오다. 
				

			}
		} catch(Exception e) { // 오류 발생시 잡는다.
			try { // 
				if (rs != null) rs.close(); // rs 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
				if (st != null) st.close(); // st 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
			} catch(SQLException e1) {}
		}
	}
		//4. 넓이(10,0002 km)를 입력 받아서 입력 값보다 작은 면적을 가진 국가의 이름과 면적을 면적 오름차순으로 검색해서 출력하세요.
		private static void QueryPrepareStatement4(PreparedStatement st, Connection con) { // con 매개변수를 받아서 실행
			ResultSet rs = null; //  ResultSet 객체 초기화.
		try { // 도전!!!!!!!!
			System.out.print("넓이를 입력 : "); // "인구 수 : "출력
			int val = sc.nextInt(); // 문자열 val 변수에 sc.nextInt 정수형 입력변수 값 대입 
			
			PreparedStatement psmt = con.prepareStatement("select Name, SurfaceArea  from country where SurfaceArea < ? " + " order by Name, SurfaceArea ASC "); // PreparedStatement 객체 생성 및 con 연결객체 대입 
			psmt.setInt(1, val);
			rs = psmt.executeQuery(); // 쿼리 질의문의 결과를 rs에 저장
			
			while(rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("Name")+","); // 문자열 Name 값을 가져오다. 
				System.out.print(rs.getInt("SurfaceArea")+"\n");
				

			}
		} catch(Exception e) { // 오류 발생시 잡는다.
			try { // 
				if (rs != null) rs.close(); // rs 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
				if (st != null) st.close(); // st 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
			} catch(SQLException e1) {}
		}
	}
		
		// 5. 대한민국의 District를 입력 받아서 해당 지역에 있는 모든 도시를 검색해서 출력하세요. (예:‘Kyonggi’)
		private static void QueryPrepareStatement5(PreparedStatement st, Connection con) { // con 매개변수를 받아서 실행
			ResultSet rs = null; //  ResultSet 객체 초기화.
		try { // 도전!!!!!!!!
			System.out.print("대한민국의 District를 입력 : "); // "인구 수 : "출력
			String val = sc.next(); // 문자열 val 변수에 sc.nextInt 정수형 입력변수 값 대입 
			
			PreparedStatement psmt = con.prepareStatement("select Name, CountryCode from city where District = ? "); // PreparedStatement 객체 생성 및 con 연결객체 대입 
			psmt.setString(1, val);
			rs = psmt.executeQuery(); // 쿼리 질의문의 결과를 rs에 저장
			
			while(rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("name")+", ");
				System.out.print(rs.getString("CountryCode")+"\n");
				

			}
		} catch(Exception e) { // 오류 발생시 잡는다.
			try { // 
				if (rs != null) rs.close(); // rs 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
				if (st != null) st.close(); // st 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
			} catch(SQLException e1) {}
		}
	}
		//6. 언어를 입력 받아서 해당 언어가 국가 공식 언어인 국가를 검색해서 출력하세요. (예:'Spanish’)
		private static void QueryPrepareStatement6(PreparedStatement st, Connection con) { // con 매개변수를 받아서 실행
			ResultSet rs = null; //  ResultSet 객체 초기화.
		try { // 도전!!!!!!!!
			System.out.print("언어를 입력 : "); // "인구 수 : "출력
			String val = sc.nextLine(); // 문자열 val 변수에 sc.nextInt 정수형 입력변수 값 대입 
			
			PreparedStatement psmt = con.prepareStatement("SELECT Name FROM countrylanguage A join country B on a.CountryCode = b.Code where Language = ?"); // PreparedStatement 객체 생성 및 con 연결객체 대입 
			psmt.setString(1, val);
			rs = psmt.executeQuery(); // 쿼리 질의문의 결과를 rs에 저장
			
			while(rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("name")+"\n ");
				
				

			}
		} catch(Exception e) { // 오류 발생시 잡는다.
			try { // 
				if (rs != null) rs.close(); // rs 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
				if (st != null) st.close(); // st 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
			} catch(SQLException e1) {}
		}
	}
		private static void QueryPrepareStatement7(PreparedStatement st, Connection con) { // con 매개변수를 받아서 실행
			ResultSet rs = null; //  ResultSet 객체 초기화.
		try { // 도전!!!!!!!!
			System.out.print("사용자 입력비율 이상 입력 :"); // "인구 수 : "출력
			int val = sc.nextInt(); // 문자열 val 변수에 sc.nextInt 정수형 입력변수 값 대입 
			
			PreparedStatement psmt = con.prepareStatement("select CountryCode, Percentage from countrylanguage where Percentage > ?" + " order by Percentage asc "); // PreparedStatement 객체 생성 및 con 연결객체 대입 
			psmt.setInt(1, val);
			rs = psmt.executeQuery(); // 쿼리 질의문의 결과를 rs에 저장
			
			while(rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("CountryCode")+",  ");
				System.out.print(rs.getFloat("Percentage")+"%"+"\n");
				
				

			}
		} catch(Exception e) { // 오류 발생시 잡는다.
			try { // 
				if (rs != null) rs.close(); // rs 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
				if (st != null) st.close(); // st 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
			} catch(SQLException e1) {}
		}
	}

		

		

		
		
		
		
		
		
		
		
}
