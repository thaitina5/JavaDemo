
public class Test {

	public static void main(String[] args) {
		NgayChieu n = new NgayChieu(22,4,2023);
		HangSX h = new HangSX("Disney","US");
		Phim p = new Phim("IronMan", 2005, 10.000, h, n);
		
		System.out.println(p.getNgay());
	}

}
