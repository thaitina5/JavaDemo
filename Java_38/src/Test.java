
public class Test {

	public static void main(String[] args) {
		QuocGia qg = new QuocGia("VN", "Viet Nam");
		QuocGia qg2 = new QuocGia("US", "United State");
		QuocGia qg3 = new QuocGia("CA", "Canada");
		
		HangSangXuat hsx = new HangSangXuat("DELL", qg3);
		HangSangXuat hsx2 = new HangSangXuat("ASUS", qg2);
		HangSangXuat hsx3 = new HangSangXuat("MSI", qg);
		
		NgaySanXuat nsx = new NgaySanXuat(10, 4, 2004);
		NgaySanXuat nsx2 = new NgaySanXuat(3, 5, 2022);
		NgaySanXuat nsx3 = new NgaySanXuat(4, 4, 2023);
		
		MayTinh mt = new MayTinh(hsx, nsx, 200000, 3);
		MayTinh mt2 = new MayTinh(hsx2, nsx2, 300000, 9);
		MayTinh mt3 = new MayTinh(hsx3, nsx3, 150000, 3);
		
		System.out.println(mt.kiemTraGiaThapHon(mt3));
		System.out.println(mt.kiemTraGiaThapHon(mt2));
		System.out.println(mt.showTenQuocGiaSX());
	}

}
