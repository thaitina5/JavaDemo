
public class Phim {
	private String tenPhim;
	private int namSanXuat;
	private double giaVe;
	private HangSX hangSX;
	private NgayChieu ngay;

	public Phim(String tenPhim, int namSanXuat, double giaVe, HangSX hangSX, NgayChieu ngay) {
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.giaVe = giaVe;
		this.hangSX = hangSX;
		this.ngay = ngay;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public HangSX getHangSX() {
		return hangSX;
	}

	public void setHangSX(HangSX hangSX) {
		this.hangSX = hangSX;
	}

	public NgayChieu getNgay() {
		return ngay;
	}

	public void setNgay(NgayChieu ngay) {
		this.ngay = ngay;
	}
	
	//methods
	public boolean kiemTraGiaReHon(Phim phimKhac) {
		return this.giaVe < phimKhac.giaVe;
	}
	
	public String layTenHangSX() {
		return this.hangSX.getTenHangSX();
	}
	
	public double giaSauKhuyenMai(double x) {
		return this.giaVe*(1-x/100);
	}
}
