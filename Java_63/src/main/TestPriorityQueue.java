package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		Queue<String> danhSachSV = new PriorityQueue<String>();
	     danhSachSV.offer("B");
	     danhSachSV.offer("2");
	     danhSachSV.offer("A");
	     danhSachSV.offer("1");
	     
	     while(true){
	       String ten = danhSachSV.poll();
	       if(ten==null){
	         break;
	       }
	       System.out.println(ten);
	     }
	}

}
