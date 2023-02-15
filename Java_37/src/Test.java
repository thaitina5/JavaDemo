
public class Test {

	public static void main(String[] args) {
		NgaySinh ns = new NgaySinh(10,11,1998);
		NgaySinh ns2 = new NgaySinh(10,11,1998);
		
		Lop l = new Lop("Toan","ChuyenToan");
		Lop l2 = new Lop("Van","ChuyenVan");
		
		SinhVien sv = new SinhVien("ThaiTin", ns, 9, l);
		SinhVien sv2 = new SinhVien("MyThu", ns2, 4, l2);
		
		System.out.println("Ten khoa sv "+ sv.getHoTen() + " dang hoc: "+sv.tenKhoaDangHoc());
		
		System.out.println("Ket qua cua sv "+ sv.getHoTen()+ ": " + sv.kiemTraDau());
		
		System.out.println(sv.getNgaySinh());
		System.out.println(sv2.getNgaySinh());
		
		System.out.println("Kiem tra ngay sinh giong nhau: "+ sv.kiemTraNgaySinh(sv2));
	}

}
