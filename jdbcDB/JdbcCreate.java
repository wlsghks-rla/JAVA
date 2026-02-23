package jdbcDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lombok.Data;


public class JdbcCreate {

	public static void main(String[] args) {
		
		Connection conn = null;
		// Oracle Driver 등록, DriverManager 객체 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			// db 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"java",
					"1234");
			System.out.println("연결성공!");
			
			// db 작업
			// create_insert
			// 매개변수화된 sql 작성
			String sql = "INSERT INTO test ( bno, title, content, writer)"
					+ "VALUES(seq_bno.nextval, ?, ?, ?)";
					
			// sql실행문을 만들어 실행
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "새해 소식");
			pstmt.setString(2, "새해가 와요");
			pstmt.setString(3, "winter");
			
			int row = pstmt.executeUpdate(); // select executeQuery
			
			if(row != 0) {
				System.out.println("추가 되었습니다.");
			} else {
				System.out.println("추가 실패");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결끊김");
				} catch (SQLException e) {					
					e.printStackTrace();
				}
			}
		}
		

	}

}
