
public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public MayBay(HangSanXuat hangSX, String loaiNhienLieu) {
		super("May Bay", hangSX);
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
		return 2500;
	}
	
	public void catCanh() {
		System.out.println("Cat canh...");
	}
	
	public void haCanh() {
		System.out.println("Ha Canh...");
	}
	
}
