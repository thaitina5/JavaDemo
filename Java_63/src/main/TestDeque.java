package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {

	public static void main(String[] args) {
		Deque<String> danhSachSV = new ArrayDeque<String>();
		danhSachSV.offer("B");
		danhSachSV.offer("2");
		danhSachSV.offer("A");
		danhSachSV.offer("1");
		danhSachSV.offerFirst("0");
		danhSachSV.offerLast("E");
		System.out.println(danhSachSV);
		while (true) {
			String ten = danhSachSV.poll();
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}

}
