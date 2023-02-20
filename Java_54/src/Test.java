
public class Test {

	public static void main(String[] args) {
		SinhVien sv = new SinhVien(100, "Thai Tin", "Lop1", 9);
		SinhVien sv2 = new SinhVien(150, "My Thu", "Lop1", 5);
		
		System.out.println(sv.compareTo(sv2));
	}

}
