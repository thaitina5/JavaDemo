package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> chuoiStack = new Stack<String>();
		/* push() đưa giá trị vào stack
		 * pop()  lấy giá trị ra và xóa khỏi stack
		 * peek() lấy giá trị ra nhưng ko xóa khỏi stack
		 * clear() xóa tất cả phần tử trong stack
		 * contain() kiểm tra giá trị có tồn tại trong stack ko
		 * size() độ lớn của stack
		 * */
		System.out.print("Input string: ");
		String s = sc.nextLine();
		
		for(int i=0; i<s.length(); i++) {
			chuoiStack.push(""+s.charAt(i));
		}
		System.out.println("Stack: "+chuoiStack);
		
		System.out.print("Reverse string: ");
		for(int i=0; i<s.length(); i++) {
			 System.out.print(chuoiStack.pop());
		}
		
		System.out.println(" ");
		
		//Chuyển số nhị phân sang thập phân
		Stack<Integer> t = new Stack<Integer>();
		System.out.print("Input number: ");
		int x = sc.nextInt();
		System.out.print("Binary of "+x+": ");
		while(x>0) {
			int soDu = x%2;
			t.push(soDu);
			x/=2;
		}
		int n = t.size();
		for(int i=0; i<n; i++) {
			System.out.print(t.pop());
		}
		
	}

}
