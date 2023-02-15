
public class SinhVien {
	private String hoTen;
	private NgaySinh ngaySinh;
	private float diemTB;
	private Lop lop;
	
	public SinhVien(String hoTen, NgaySinh ngaySinh, float diemTB, Lop lop) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lop = lop;
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

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
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
		return diemTB >= 5 ? "PASSED":"FAILED";
	}
	
	public boolean kiemTraNgaySinh(SinhVien sv) {
		return ngaySinh.equals(sv.ngaySinh);
	}
}
