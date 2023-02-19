
public class Test {

	public static void main(String[] args) {
		ConNguoi cn = new ConNguoi("ThaiTin", 1998);
		System.out.println("=== Con Nguoi: "+cn.getHoTen());
		cn.eat();
		cn.drink();
		cn.sleep();
		HocSinh hs = new HocSinh("MyThu", 1998, "Nguyen Tat Thanh", "12A5");
		System.out.println("=== Hoc Sinh: "+hs.getHoTen());
		hs.eat();
		hs.sleep();
		hs.doHomeWork();
		
	}

}
