
public class SinhVien implements Comparable<SinhVien>{
	private int maSinhVien;
	private String hoTen, lop;
	private double diemTrungBinh;
	
	public SinhVien(int maSinhVien, String hoTen, String lop, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.lop = lop;
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	//So sánh Tên các SV để sắp xếp theo thứ tự bảng chữ cái
	public String getTen() {
		String s = this.hoTen.trim();
		if(s.indexOf(" ")>=0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		} else {
			return s;
		}
	}
	
	@Override
	public int compareTo(SinhVien o) {
		String tenThis = this.getTen();
		String tenO = o.getTen();
		return tenThis.compareTo(tenO);
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", lop=" + lop + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}
	
	
}
