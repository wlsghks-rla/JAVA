package jdbcDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConn {

	public static void main(String[] args) {
		Connection conn = null; // connection 생성
		
		// 오라클 드라이버 등록, Driver Manager 객체 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			// DB 연결(thin : tcp protocol)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"java",
					"1234"
					);
			System.out.println("연결성공!");
			
			// DB작업
					
		} catch (ClassNotFoundException e) {
			// Class.forName("oracle.jdbc.OralceDriver");
			e.printStackTrace();
		} catch (SQLException e) {
			// DB 연결(thin : tcp 연결)
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
