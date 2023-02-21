import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String s = "Xin chao cac ban, tui la Peter";
	    String s2 = "Xin chao cac ban, tui la Peter. Tui dang hoc dai hoc";
	    String hoTen = "Thai Tin";
	    
	    String[] a = s.split(" ");
	    System.out.println(Arrays.toString(a));
	    
	    String[] b = s.split(",");
	    System.out.println(Arrays.toString(b));
	    
	    String[] c = s2.split("\\,|\\.");
	    System.out.println(Arrays.toString(c));
	    
	    String[] d = hoTen.split(" ");
	    System.out.println("Lay ten: "+ d[d.length-1]);
	}

}
