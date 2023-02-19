import java.util.Objects;

public class MayTinh {
	private HangSangXuat hangSX;
	private NgaySanXuat ngaySX;
	private double giaBan;
	private int thangBaoHanh;
	
	public MayTinh(HangSangXuat hangSX, NgaySanXuat ngaySX, double giaBan, int thangBaoHanh) {
		this.hangSX = hangSX;
		this.ngaySX = ngaySX;
		this.giaBan = giaBan;
		this.thangBaoHanh = thangBaoHanh;
	}
	
	public HangSangXuat getHangSX() {
		return hangSX;
	}
	public void setHangSX(HangSangXuat hangSX) {
		this.hangSX = hangSX;
	}
	public NgaySanXuat getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(NgaySanXuat ngaySX) {
		this.ngaySX = ngaySX;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getThangBaoHanh() {
		return thangBaoHanh;
	}
	public void setThangBaoHanh(int thangBaoHanh) {
		this.thangBaoHanh = thangBaoHanh;
	}

	//methods
	public String kiemTraGiaThapHon(MayTinh mtKhac) {
		return this.giaBan < mtKhac.giaBan? "Gia THAP hon":"Gia CAO hon";
	}
	
	public String showTenQuocGiaSX() {
		return this.hangSX.getQuocGia().getTenQuocGia();
	}
}
