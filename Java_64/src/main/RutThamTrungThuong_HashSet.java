package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
	Set<String> tapHopPhieu =  new HashSet<String>();
	
	public RutThamTrungThuong_HashSet() {
	}

	public boolean themPhieu(String giaTri) {
		return this.tapHopPhieu.add(giaTri);
	}
	
	public boolean xoaPhieu(String giaTri) {
		return this.tapHopPhieu.remove(giaTri);
	}
	
	public boolean kiemTraPhieu(String giaTri) {
		return this.tapHopPhieu.contains(giaTri);
	}
	
	public void xoaTatCaPhieu() {
		this.tapHopPhieu.clear();
	}
	
	public int laySoLuongPhieu() {
		return this.tapHopPhieu.size();
	}
	
	public String rutPhieu() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.tapHopPhieu.size());
		ketQua = (String) this.tapHopPhieu.toArray()[viTri];
		return ketQua;
	}
	
	public void inTatCaPhieu() {
		System.out.println(Arrays.toString(this.tapHopPhieu.toArray()));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
		int luaChon = 0;
		do {
			System.out.println("=== SELECT OPTIONS ===");
			System.out.println("(1) Add ticket");
			System.out.println("(2) Delete ticket");
			System.out.println("(3) Check ticket exist or not");
			System.out.println("(4) Delete all ticket");
			System.out.println("(5) Ticket number");
			System.out.println("(6) Draw ticket");
			System.out.println("(7) Print all ticket");
			System.out.println("(0) Exit program");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon==1 || luaChon==2 || luaChon==3) {
				System.out.println("Nhap ma phieu: ");
				String giaTri = sc.nextLine();
				if(luaChon==1) {
					rt.themPhieu(giaTri);
				} else if (luaChon==2) {
					rt.xoaPhieu(giaTri);
				} else if (luaChon==3) {
					System.out.println("Kiem tra phieu: "+rt.kiemTraPhieu(giaTri));
				}
			} else if (luaChon==4) {
				rt.xoaTatCaPhieu();
			} else if (luaChon==5) {
				System.out.println("So luong phieu: "+rt.laySoLuongPhieu());
			} else if (luaChon==6) {
				System.out.println("Ket qua TRUNG THUONG: "+rt.rutPhieu());
			} else if (luaChon==7) {
				System.out.println("Tat ca phieu: ");
				rt.inTatCaPhieu();
			} else if (luaChon==0) {
				break;
			}
		} while(luaChon!=0);
		
	}

}
