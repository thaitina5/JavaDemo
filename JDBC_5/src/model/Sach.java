package model;

public class Sach {
	private String id_sach;
	private String tenSach;
	private double giaBan;
	private int namXuatBan;
	
	public Sach() {
		super();
	}

	public Sach(String id_sach, String tenSach, double giaBan, int namXuatBan) {
		this.id_sach = id_sach;
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
	}

	public String getId_sach() {
		return id_sach;
	}

	public void setId_sach(String id_sach) {
		this.id_sach = id_sach;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	@Override
	public String toString() {
		return "Sach [id_sach=" + id_sach + ", tenSach=" + tenSach + ", giaBan=" + giaBan + ", namXuatBan=" + namXuatBan
				+ "]";
	}
	
	
}
