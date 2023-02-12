
public class TacGia {
	private String tenTacGia;
	private Ngay ngaySinh;
	
	public TacGia(String tenTacGia, Ngay ngaySinh) {
		this.tenTacGia = tenTacGia;
		this.ngaySinh = ngaySinh;
	}
	
	public String getTenTG() {
		return this.tenTacGia;
	}
	public void setTenTG(String tenTacGia) {
		this.tenTacGia = tenTacGia; 
	}

	public Ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
}
