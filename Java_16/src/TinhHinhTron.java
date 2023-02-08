import java.util.Scanner;

public class TinhHinhTron {
	public static void main(String[] args) {
		double r, chuVi, dienTich;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap r: ");
		r = sc.nextDouble();
		
		chuVi = 2*Math.PI*r;
		System.out.println("Chu vi: "+chuVi);
		System.out.println("Chu vi: "+Math.round(chuVi*100)/100.0);
		dienTich = Math.PI*Math.pow(r, 2);
		System.out.println("Dien tich: "+dienTich);
		System.out.println("Dien tich: "+Math.round(dienTich*100)/100.0);
	}
}
