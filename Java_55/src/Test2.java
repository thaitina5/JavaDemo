import java.lang.reflect.Array;
import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		SinhVien sv = new SinhVien(100, "Thai Tin", "Lop1", 9);
		SinhVien sv2 = new SinhVien(150, "My Thu", "Lop1", 5);
		SinhVien sv3 = new SinhVien(90, "Thao Uyen", "Lop1", 6);
		
		SinhVien[] a_sv = {sv3, sv, sv2};
		
		System.out.println("Array before: "+Arrays.toString(a_sv));
		Arrays.sort(a_sv);
		System.out.println("Array after: "+Arrays.toString(a_sv));
		
		System.out.println("Tim kiem Thu: "+Arrays.binarySearch(a_sv, sv));
	}

}
