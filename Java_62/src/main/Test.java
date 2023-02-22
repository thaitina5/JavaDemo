package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> chuoiStack = new Stack<String>();
		
		System.out.println("Input string: ");
		String s = sc.nextLine();
		
		for(int i=0; i<s.length(); i++) {
			chuoiStack.push(""+s.charAt(i));
		}
		System.out.println("Stack: "+chuoiStack);
		
		System.out.print("Reverse string: ");
		for(int i=0; i<s.length(); i++) {
			 System.out.print(chuoiStack.pop());
		}
	}

}
