
public class Oto extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public Oto(HangSanXuat hangSX, String loaiNhienLieu) {
		super("OTO", hangSX);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 250;
	}
	
	
}
