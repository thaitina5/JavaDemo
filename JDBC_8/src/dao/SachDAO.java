package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Sach;

public class SachDAO implements DAOInterface<Sach> {
	//công dụng hàm này là để đỡ phải new, gọi getInstance 
	//rồi sử dụng luôn các method bên dưới
	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int insert(Sach t) {
		int ketQua = 0;
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "insert into Sach "+
						 "values ('"+t.getId_sach()+"' , '"+t.getTenSach()+"' , "+t.getGiaBan()+", '"+t.getNamXuatBan()+"');";
			ketQua = st.executeUpdate(sql);
			System.out.println("Ban da thuc thi: "+sql);
			System.out.println("Co "+ketQua+" dong bi thay doi");
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int update(Sach t) {
		int ketQua = 0;
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "update Sach "+
						 "set "+
						 "id_sach='"+t.getId_sach()+"', "+
						 "tenSach='"+t.getTenSach()+"', "+
						 "giaBan="+t.getGiaBan()+", "+
						 "namXuatBan='"+t.getNamXuatBan()+"' "+
						 "where id_sach='"+t.getId_sach()+"'";
			ketQua = st.executeUpdate(sql);
			System.out.println("Ban da thuc thi: "+sql);
			System.out.println("Co "+ketQua+" dong bi thay doi");
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int delete(Sach t) {
		int ketQua = 0;
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "delete from Sach "+
						 "where id_sach='"+t.getId_sach()+"'";
			ketQua = st.executeUpdate(sql);
			System.out.println("Ban da thuc thi: "+sql);
			System.out.println("Co "+ketQua+" dong bi thay doi");
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		ArrayList<Sach> ketQua = new ArrayList<Sach>();
		
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "select * from Sach;";
			// ResultSet như là 1 table để đưa data từ csdl lên
			// và có thể dùng vòng lặp để hiển thị từng dòng data ra
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String id_sach = rs.getString("id_sach");
				String tenSach = rs.getString("tenSach");
				double giaBan = rs.getDouble("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
				
				Sach s = new Sach(id_sach,tenSach,giaBan,namXuatBan);
				ketQua.add(s);
			}
			System.out.println("Ban da thuc thi: "+sql);
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public Sach selectById(Sach t) {
		Sach ketQua = null;
		
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "select * from Sach where id_sach='"+t.getId_sach()+"';";
			
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String id_sach = rs.getString("id_sach");
				String tenSach = rs.getString("tenSach");
				double giaBan = rs.getDouble("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
				
				Sach s = new Sach(id_sach,tenSach,giaBan,namXuatBan);
			}
			System.out.println("Ban da thuc thi: "+sql);
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String Condition) {
		ArrayList<Sach> ketQua = new ArrayList<Sach>();
		
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "select * from Sach where "+ Condition +";";
			
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String id_sach = rs.getString("id_sach");
				String tenSach = rs.getString("tenSach");
				double giaBan = rs.getDouble("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
				
				Sach s = new Sach(id_sach,tenSach,giaBan,namXuatBan);
				ketQua.add(s);
			}
			System.out.println("Ban da thuc thi: "+sql);
			JDBCUtil.closeConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}
	
}
