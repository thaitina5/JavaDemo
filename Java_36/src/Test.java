
public class Test {

	public static void main(String[] args) {
		NgayChieu n = new NgayChieu(22,4,2023);
		NgayChieu n2 = new NgayChieu(10,8,2022);
		
		HangSX h = new HangSX("Disney","US");
		HangSX h2 = new HangSX("Mappa","JAPAN");
		
		Phim p = new Phim("IronMan", 2005, 10000, h, n);
		Phim p2 = new Phim("DemonSlayer", 2016, 20000, h2, n2);
		
		System.out.println("Gia ve phim 1 re hon phim 2: " + p.kiemTraGiaReHon(p2));
		
		System.out.println("Ten hang sx cua phim la: " + p.layTenHangSX());
		
		System.out.println("Gia ve khuyen mai la: " + p.giaSauKhuyenMai(10));
		System.out.println("Gia ve khuyen mai la: " + p2.giaSauKhuyenMai(10));
	}

}
