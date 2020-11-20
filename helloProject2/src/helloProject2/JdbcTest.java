package helloProject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	/* 초기화 작업 */
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //문자열로 주어진 클래스를 주메모리에 로딩하는 역할
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://34.92.10.238:3306/mysql","root","root1234");
			if(con==null) {
				System.out.println("접속오류");
			}else {
				System.out.println("접속성공!!!");
			}
			//db로부터 조회
			String sql="select * from customer order by name";
			//조회문을 전달할 객체 생성
			Statement stmt=con.createStatement();
			
			//조회문을 db에 전달 후 결과 받기
			ResultSet rs = stmt.executeQuery(sql);
			
			//받은 결과를 출력하기
			while(rs.next()) {
				int seq_id=rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				String tel=rs.getNString(4);
				String s_no=rs.getNString(5);
				System.out.println(seq_id+"|"+name+"|"+address+"|"+s_no+"|");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
