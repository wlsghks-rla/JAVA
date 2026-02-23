package jdbcDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class JdbcRead {

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
			// read_insert
			// 매개변수화된 sql 작성
//			String sql = "SELECT * FROM test WHERE content = ?";
			String sql = "SELECT * FROM test";
					
			// sql실행문을 만들어 실행
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
//			pstmt.setInt(1, 2);
//			pstmt.setString(1, "꽃이 폈어요");
			
			ResultSet rs = pstmt.executeQuery(); // select executeQuery
			List<Test> list = new ArrayList<>(); 
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString(3);
				String writer = rs.getString(4);
				
				list.add(new Test(bno, title, content, writer));
			}
			
			for(Test data : list) {
				System.out.println(data);
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
