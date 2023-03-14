package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.User;

public class UserDAO implements DAOInterface<User>{
	
	public static UserDAO getInstance() {
		return new UserDAO();
	}
	
	@Override
	public int insert(User t) {
		int ketQua = 0;
		
		try {
			Connection conn = JDBCUtil.getConnection();
			String sql = "insert into User values (?, ?, ?);";
			
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			pst.setString(2, t.getPassWord());
			pst.setString(3, t.getHoVaTen());
			
			ketQua = pst.executeUpdate();
			System.out.println(sql);
			System.out.println("Co "+ketQua+" dong bi thay doi");
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int update(User t) {
		int ketQua = 0;
		
		try {
			Connection conn = JDBCUtil.getConnection();
			String sql = "update User "+
						 "set passWord=?, hoVaTen=? "+
						 "where userName=?;";
			
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getPassWord());
			pst.setString(2, t.getHoVaTen());
			pst.setString(3, t.getUserName());
			
			ketQua = pst.executeUpdate();
			System.out.println(sql);
			System.out.println("Co "+ketQua+" dong bi thay doi");
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int delete(User t) {
		int ketQua = 0;
		
		try {
			Connection conn = JDBCUtil.getConnection();
			String sql = "delete from User where username=?;";
			
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			
			ketQua = pst.executeUpdate();
			System.out.println(sql);
			System.out.println("Co "+ketQua+" dong bi thay doi");
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public ArrayList<User> selectAll() {
		ArrayList<User> ketQua = new ArrayList<User>();
		
		try {
			Connection conn = JDBCUtil.getConnection();
			String sql = "select * from User;";
			
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String userName = rs.getString("userName");
				String passWord = rs.getString("passWord");
				String hoVaTen = rs.getString("hoVaTen");
				
				User u = new User(userName, passWord, hoVaTen);
				ketQua.add(u);
			}
			System.out.println(sql);
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public User selectById(User t) {
		User ketQua = null;
		
		try {
			Connection conn = JDBCUtil.getConnection();
			String sql = "select * from User where userName=?;";
			
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String userName = rs.getString("userName");
				String passWord = rs.getString("passWord");
				String hoVaTen = rs.getString("hoVaTen");
				
				ketQua = new User(userName, passWord, hoVaTen);
			}
			System.out.println(sql);
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public ArrayList<User> selectByCondition(String Condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
