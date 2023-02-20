import java.util.Arrays;

public class Test {
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for(int i = x.length-1; i>=0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 5, 4, 3, 6, 10};
		int[] b = new int[15];
		
		//ham sắp xếp tăng dần
		Arrays.sort(a);
		System.out.println("Array a: "+ Arrays.toString(a));
		
		//hàm binarySearch() chỉ có thể tìm kiễm mảng đã sắp xếp
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(b, -1));
		
		//hàm điền chổ trống
		Arrays.fill(b, 5);
		System.out.println("Array b: "+Arrays.toString(b));
		
		//đảo ngược array
		a = Test.reverse(a);
		System.out.println("Array a reverse: "+Arrays.toString(a));
	}
}
