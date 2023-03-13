package model;

import java.sql.Date;

public class Khach {
	private int id_khach;
	private String tenKhach;
	private Date ngaySinh;
	private String diaChi;
	
	public Khach() {
		super();
	}
	
	public Khach(int id_khach, String tenKhach, Date ngaySinh, String diaChi) {
		this.id_khach = id_khach;
		this.tenKhach = tenKhach;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public int getId_khach() {
		return id_khach;
	}

	public void setId_khach(int id_khach) {
		this.id_khach = id_khach;
	}

	public String getTenKhach() {
		return tenKhach;
	}

	public void setTenKhach(String tenKhach) {
		this.tenKhach = tenKhach;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "Khach [id_khach=" + id_khach + ", tenKhach=" + tenKhach + ", ngaySinh=" + ngaySinh + ", diaChi="
				+ diaChi + "]";
	}
	
	
}


