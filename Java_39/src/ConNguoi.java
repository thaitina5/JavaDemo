
public class ConNguoi {
	private String hoTen;
	private int namSinh;

	public ConNguoi(String hoTen, int namSinh) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	//methods
	public void eat() {
		System.out.println("Eating....");
	}
	
	public void sleep() {
		System.out.println("Sleeping...zzz");
	}
	
	public void drink() {
		System.out.println("Drinking....");
	}
	
}
