
public class Test {

	public static void main(String[] args) {
		 ToString ts = new ToString(10, 11, 1998);
		 ToString ts2 = new ToString(16, 9, 1930);
		 ToString ts3 = new ToString(10, 11, 1998);
		 
		 System.out.println(ts);
		 
		 System.out.println(ts.equals(ts3));
		 
		 System.out.println(ts.hashCode());
		 System.out.println(ts2.hashCode());
		 System.out.println(ts3.hashCode());
	}

}
