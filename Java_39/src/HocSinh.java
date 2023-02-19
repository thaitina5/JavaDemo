
public class HocSinh extends ConNguoi {
	private String tenTruong, tenLop;

	public HocSinh(String hoTen, int namSinh, String tenTruong, String tenLop) {
		super(hoTen, namSinh);
		this.tenTruong = tenTruong;
		this.tenLop = tenLop;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	//methods
	public void doHomeWork() {
		System.out.println("Doing homework.....");
	}
	
}
