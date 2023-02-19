
public abstract class PhuongTienDiChuyen {
	protected String tenLoaiPhuongTien;
	protected HangSanXuat hangSX;

	public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSX) {
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
		this.hangSX = hangSX;
	}

	public String getTenLoaiPhuongTien() {
		return tenLoaiPhuongTien;
	}

	public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;		
	}
	
	public HangSanXuat getHangSX() {
		return hangSX;
	}
	
	public void setHangSX(HangSanXuat hangSX) {
		this.hangSX = hangSX;
	}
	
	//methods
	public String layTenHangSX() {
		return this.hangSX.getTenHangSX();
	}
	
	public void start() {
		System.out.println("Khoi dong...");
	}
	public void speedUp() {
		System.out.println("Tang toc...");
	}
	public void stop() {
		System.out.println("Dung lai...");
	}
	
	public abstract double layVanToc();
	
	
}
