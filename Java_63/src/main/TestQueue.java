package main;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		// LinkedList implement từ cả Queue và List
		// ở đây thường sử dụng ArrayList hơn còn LinkedList thường dùng để hiện thực 1
		// Queue
		Queue<String> danhSachSinhVien = new LinkedList<String>();
		danhSachSinhVien.offer("ThaiTin");
		danhSachSinhVien.offer("MyThu");
		danhSachSinhVien.offer("Bennet");
		danhSachSinhVien.offer("Jean");

		while (true) {
			String ten = danhSachSinhVien.poll();
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
