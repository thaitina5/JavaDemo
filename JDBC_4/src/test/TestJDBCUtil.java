package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;

public class TestJDBCUtil {

	public static void main(String[] args) {
		try {
			//Kết nối csdl
			Connection connection = JDBCUtil.getConnection();
			
			//Tạo statement
			Statement st = connection.createStatement();
			
			String sql = "insert into SinhVien \r\n"
					+ "values(\"MyPhung\", 2000, 6),\r\n"
					+ "	  (\"HuyHung\", 1994, 10)";
			
			//Thực thi statement
			int check = st.executeUpdate(sql);
			
			//Trả kết quả
			System.out.println("So dong bi thay doi: "+check);
			if(check>0) {
				System.out.println("Thanh cong!");
			}else
				System.out.println("That bai!");
			
			//Đóng kết nối
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
