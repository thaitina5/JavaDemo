
public class Test {

	public static void main(String[] args) {
		MyDate md = new MyDate(10, 11, 1998);
		System.out.println("Day " + md.getDay());
		md.setDay(20);
		System.out.println("Day " + md.getDay());
		System.out.println("Success!");
	}

}
