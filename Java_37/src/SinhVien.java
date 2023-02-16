
public class SinhVien {
	private String maSoSinhVien;
	private String hoTen;
	private NgaySinh ngaySinh;
	private double diemTB;
	private Lop lop;
	
	public SinhVien(String maSoSinhVien, String hoTen, NgaySinh ngaySinh, double diemTB, Lop lop) {
		this.maSoSinhVien = maSoSinhVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}
	
	
	public String getMaSoSinhVien() {
		return maSoSinhVien;
	}

	public void setMaSoSinhVien(String maSoSinhVien) {
		this.maSoSinhVien = maSoSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}
	
	//methods
	public String tenKhoaDangHoc() {
		return this.lop.getTenKhoa();
	}
	
	public String kiemTraDau() {
		return this.diemTB >= 5 ? "PASSED":"FAILED";
	}
	
	public boolean kiemTraNgaySinh(SinhVien sv) {
		return this.ngaySinh.equals(sv.ngaySinh);
	}
}
