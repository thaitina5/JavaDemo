
public class Test {

	public static void main(String[] args) {
		HangSanXuat hsx = new HangSanXuat("BOEING", "Us");
		HangSanXuat hsx2 = new HangSanXuat("AUDI", "Germany");
		HangSanXuat hsx3 = new HangSanXuat("MIYATA", "Japan");
		
		MayBay p1 = new MayBay(hsx, "fu22");
		PhuongTienDiChuyen p2 = new Oto(hsx2, "fu24");
		PhuongTienDiChuyen p3 = new XeDap(hsx3);
		
		System.out.println(p1.layTenHangSX());
		System.out.println(p2.layTenHangSX());
		System.out.println(p3.layTenHangSX());
		
		p1.catCanh();
		System.out.println("Van toc may bay: "+p1.layVanToc()+ " Km/h");
		p1.haCanh();
	}

}
