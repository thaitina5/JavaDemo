package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Khach;

public class KhachDAO implements DAOInterface<Khach> {

	public static KhachDAO getInstance() {
		return new KhachDAO();
	}

	@Override
	public int insert(Khach t) {
		int ketQua = 0;
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "insert into Khach" + "value(" + t.getId_khach() + " , '" + t.getTenKhach() + "' , '"
					+ t.getNgaySinh() + "' , '" + t.getDiaChi() + "');";
			ketQua = st.executeUpdate(sql);
			System.out.println("Ban da thuc thi: " + sql);
			System.out.println("Co " + ketQua + " dong bi thay doi");
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int update(Khach t) {
		int ketQua = 0;
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "update Khach " + 
						 "set " + 
						 "tenKhach= '"+t.getTenKhach()+"', "+ 
						 "ngaySinh= '"+t.getNgaySinh()+"', " + 
						 "diaChi= '" +t.getDiaChi() + "' " + 
						 "where id_khach='"+t.getId_khach()+ "'";
			ketQua = st.executeUpdate(sql);
			System.out.println("Ban da thuc thi: " + sql);
			System.out.println("Co " + ketQua + " dong bi thay doi");
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int delete(Khach t) {
		int ketQua = 0;
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "delete from Khach " + "where id_khach='" + t.getId_khach() + "'";
			ketQua = st.executeUpdate(sql);
			System.out.println("Ban da thuc thi: " + sql);
			System.out.println("Co " + ketQua + " dong bi thay doi");
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList selectAll() {
		ArrayList<Khach> ketQua = new ArrayList<Khach>();
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "select * from Khach ";
			// ResultSet như là 1 table để đưa data từ csdl lên
			// và có thể dùng vòng lặp để hiển thị từng dòng data ra
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id_khach");
				String tenKhach = rs.getString("tenKhach");
				Date ngaySinh = rs.getDate("ngaySinh");
				String diaChi = rs.getString("diaChi");

				Khach kh = new Khach(id, tenKhach, ngaySinh, diaChi);
				ketQua.add(kh);
			}
			System.out.println(sql);
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public Khach selectById(Khach t) {
		Khach ketQua = null;
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "select * from Khach where id_khach=" + t.getId_khach();

			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id_khach");
				String tenKhach = rs.getString("tenKhach");
				Date ngaySinh = rs.getDate("ngaySinh");
				String diaChi = rs.getString("diaChi");

				ketQua = new Khach(id, tenKhach, ngaySinh, diaChi);
			}
			System.out.println(sql);
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList selectByCondition(String condition) {
		ArrayList<Khach> ketQua = new ArrayList<Khach>();
		try {
			Connection conn = JDBCUtil.getConnection();
			Statement st = conn.createStatement();
			String sql = "select * from Khach where " + condition;

			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id_khach");
				String tenKhach = rs.getString("tenKhach");
				Date ngaySinh = rs.getDate("ngaySinh");
				String diaChi = rs.getString("diaChi");

				Khach kh = new Khach(id, tenKhach, ngaySinh, diaChi);
				ketQua.add(kh);
			}
			System.out.println(sql);
			JDBCUtil.closeConnection(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}

}
