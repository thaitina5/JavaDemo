import java.util.Scanner;

public class MathObject {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a:");
		a = sc.nextDouble();
		System.out.println("Input b");
		b = sc.nextDouble();

		System.out.println("|a| = " + Math.abs(a));
		System.out.println("Max: " + Math.max(a, b));
		System.out.println("Sqrt: " + Math.sqrt(a));
		System.out.println("Ceil: "+ Math.ceil(a));
	}
}
