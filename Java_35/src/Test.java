
public class Test {

	public static void main(String[] args) {
		Ngay n = new Ngay(10,11,1998);
		TacGia t = new TacGia("Thai Tin", n);
		Sach s = new Sach("Attack On Titan",9.700,2000,t);
		Sach s2 = new Sach("Attack On Moon",10.000,2002,t);
		
		s.inTenSach();
		
		System.out.println("So sanh nxb: "+ s.kiemTraCungNam(s2));
		
		System.out.println("Gia khuyen mai: "+ s2.giaSauKhiGiam(10));
	}

}
