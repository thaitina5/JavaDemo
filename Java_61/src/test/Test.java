package test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		
		int luaChon = 0;
		do {
			System.out.println("=== SELECT OPTIONS ===");
			System.out.println("(1) Add student \n");
			System.out.println("(2) Print student list \n");
			System.out.println("(3) Check empty list \n");
			System.out.println("(4) Check number of student \n");
			System.out.println("(5) Empty the list \n");
			System.out.println("(6) Check student exist or not through id \n");
			System.out.println("(7) Delete student through id \n");
			System.out.println("(8) Check all student by name through input \n");
			System.out.println("(9) Print student list from high to low scores \n");
			System.out.println("(0) Exit program");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon==1) {
				System.out.println("Nhap ma sinh vien: ");
				String maSinhVien = sc.nextLine();
				System.out.println("Nhap ho ten sv: ");
				String hoTenSV = sc.nextLine();
				System.out.println("Nhap nam sinh: ");
				int namSinh = sc.nextInt();
				System.out.println("Nhap diem trung binh: ");
				double diemTB = sc.nextDouble();
				
				SinhVien sv = new SinhVien(maSinhVien, hoTenSV, namSinh, diemTB);
				dssv.themSinhVien(sv);
			} else if(luaChon==2){
				dssv.inDanhSachSinhVien();
			} else if (luaChon==3) {
				System.out.println("Danh sach rong: "+dssv.kiemTraDanhSachRong());
			} else if (luaChon==4) {
				System.out.println("So luong SV: "+dssv.laySoLuongSinhVien());
			} else if (luaChon==5) {
				System.out.println(dssv.lamRongDanhSach());
			} else if (luaChon==6) {
				System.out.println("Nhap ma SV: ");
				String maSV = sc.nextLine();
				SinhVien sv = new SinhVien(maSV);
				System.out.println("Kiem tra sinh vien ton tai: "+dssv.kiemTraTonTai(sv));
			} else if (luaChon==7) {
				System.out.println("Nhap ma SV: ");
				String maSV = sc.nextLine();
				SinhVien sv = new SinhVien(maSV);
				System.out.println("Xoa sinh vien: "+dssv.xoaSinhVien(sv));
			} else if (luaChon==8) {
				System.out.println("Nhap ten can tim: ");
				String ten = sc.nextLine();
				dssv.timSinhVien(ten);
			} else if (luaChon==9) {
				dssv.sapXepDiemGiamDan();
				dssv.inDanhSachSinhVien();
			} else if (luaChon==0) {
				break;
			}
		}while(luaChon!=0);
	}
	
}
