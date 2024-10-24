package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PhoneBookDao {
	private static Scanner sc = new Scanner(System.in);
	private static String url = "jdbc:mysql://localhost:3306/myfirstdb";
	private static String user = "root";
	private static String pass = "tiger";

	public static void main(String[] args) throws Exception {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			boolean flag = true;
			while (flag) {
				System.out.println("[I]nsert/[U]pdate/[D]elete/[S]elect/e[X]it:");
				char s = sc.next().toUpperCase().charAt(0);
				switch (s) {
				case 'I':
					insertPhonebook(con);
					break;
				case 'U':
					updatePhonebook(con);
					break;
				case 'D':
					deLetePhonebook(con);
					break;
				case 'S':
					seLectALLPhonebook(con, st);
					break;
				case 'X':
					flag = false;
					break;
				}
			}
			System.out.println("Bye~");
		} catch (Exception e) {
			System.out.println("연결실패 :" + e.getMessage()); // 연결실패 : + 오류 메세지 출력
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void insertPhonebook(Connection con) throws SQLException {
		try {
			String sql = "insert into phonebook(name, mobile) values(?,?)";

			PreparedStatement psmt = con.prepareStatement(sql);

			System.out.println("이름을 입력 : ");
			String name = sc.next();
			
			System.out.println("휴대폰 전화번호를 입력 : ");
			String mobile = sc.next();
			psmt.setString(1, name);
			psmt.setString(2, mobile);
			psmt.executeUpdate();

		} catch (Exception e) {
		}
	}

	private static void updatePhonebook(Connection con) throws SQLException {
		try {
			String sql = "update phonebook set home = ?  where id=?";
			System.out.println("수정할 집 전화입력 : ");
			String home = sc.next();
			System.out.println("몇 번째 ID를? : ");
			String id = sc.next();
			
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, home);
			psmt.setString(2, id);
			psmt.executeUpdate();
		} catch (Exception e) {
		}
	}

	private static void deLetePhonebook(Connection con) throws SQLException {
		try {
			String sql = "delete from phonebook where id = ?";
			int id = sc.nextInt();
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, id);
			psmt.executeUpdate();
		} catch (Exception e) {
		}
	}

	private static void seLectALLPhonebook(Connection con, PreparedStatement st) {
		ResultSet rs = null;
		try {
			int limit = sc.nextInt();
			System.out.print(" phonebook 데이터를 몇개 검색할 것인지 입력 : ");
			String sql = "SELECT * FROM phonebook limit ? ";
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, limit);
			psmt.executeQuery();

			while (rs.next()) { // rs의 데이터가 있을 떄 반복 수행
				System.out.print(rs.getString("name") + ",  ");
				System.out.print(rs.getString("mobile") + ",  ");
				System.out.print(rs.getString("home") + ",  ");
				System.out.print(rs.getString("company") + ",  ");
				System.out.print(rs.getString("email") + " \n");

			}

		} catch (Exception e) {
			try { //
				if (rs != null)
					rs.close(); // rs 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
				if (st != null)
					st.close(); // st 즉, ResultSet의 자원이 닫히지 않았다면 , rs를 닫는다.
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		}
	}
}
