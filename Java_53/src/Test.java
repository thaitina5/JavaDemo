import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		
		//copy mảng bằng Gán
		int[] b = a;
		a[0]=100;
		System.out.println("Array a:"+Arrays.toString(a));
		System.out.println("Array b:"+Arrays.toString(b));
		
		//copy mảng bằng System.arraycopy
		int[] c = new int[a.length];
		System.arraycopy(a, 0, c, 0, a.length);
		c[0] = 50;
		System.out.println("Array a:"+Arrays.toString(a));
		System.out.println("Array c:"+Arrays.toString(c));
		
		//copy mảng bằng Clone
		int[] d = a.clone();
		d[0] = 10;
		System.out.println("Array a:"+Arrays.toString(a));
		System.out.println("Array d:"+Arrays.toString(d));
		
	}

}
