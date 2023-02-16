
public class Test {

	public static void main(String[] args) {
		ToaDo td = new ToaDo(5,5);
		ToaDo td2 = new ToaDo(7,5);
		ToaDo td3 = new ToaDo(4,9);
		
		Hinh h = new Diem(td);
		Hinh h2 = new HinhTron(td2, 10);
		Hinh h3 = new HinhChuNhat(td3, 8, 4);
		
		System.out.println(h.tinhDienTich());
		System.out.println(h2.tinhDienTich());
		System.out.println(h3.tinhDienTich());
	}

}
