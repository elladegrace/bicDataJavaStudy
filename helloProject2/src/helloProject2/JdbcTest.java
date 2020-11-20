package helloProject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	/* �ʱ�ȭ �۾� */
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //���ڿ��� �־��� Ŭ������ �ָ޸𸮿� �ε��ϴ� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://34.92.10.238:3306/mysql","root","root1234");
			if(con==null) {
				System.out.println("���ӿ���");
			}else {
				System.out.println("���Ӽ���!!!");
			}
			//db�κ��� ��ȸ
			String sql="select * from customer order by name";
			//��ȸ���� ������ ��ü ����
			Statement stmt=con.createStatement();
			
			//��ȸ���� db�� ���� �� ��� �ޱ�
			ResultSet rs = stmt.executeQuery(sql);
			
			//���� ����� ����ϱ�
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
