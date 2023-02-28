package main;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
	File file;

	public ViDuFile(String tenFile) {
		this.file = new File(tenFile);
	}

	public boolean kiemTraThucThi() {
		return this.file.canExecute();
	}

	public boolean kiemTraDoc() {
		return this.file.canRead();
	}

	public boolean kiemTraGhi() {
		return this.file.canWrite();
	}

	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}

	public void inTen() {
		System.out.println(this.file.getName());
	}

	public void kiemTraLaThuMucHoacTapTin() {
		if (this.file.isDirectory()) {
			System.out.println("Đây là thư mục");
		} else if (this.file.isFile()) {
			System.out.println("Đây là tập tin");
		}
	}

	public void inDanhSachCacFileCon() {
		if (this.file.isDirectory()) {
			System.out.println("Các tập tin con/ thư mục con là:");
			File[] mangCon = this.file.listFiles();
			for (File file : mangCon) {
				System.out.println(file.getAbsolutePath());
			}
		} else if (this.file.isFile()) {
			System.out.println("Đây là tập tin, không có dữ liệu con bên trong.");
		}
	}

	public void inCayThuMuc() {
		this.inChiTietCayThucMuc(this.file, 1);
	}
	
	public void inChiTietCayThucMuc(File f, int bac) {
//		System.out.print("|");
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if (f.canRead()&&f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (File fx : mangCon) {
				inChiTietCayThucMuc(fx, bac + 1);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		System.out.println("Nhap ten file: ");
		String tenFile = sc.nextLine();
		ViDuFile vdf = new ViDuFile(tenFile);
		do {
			System.out.println("=== SELECT OPTIONS ===");
			System.out.println("(1) Kiem tra file thuc thi");
			System.out.println("(2) Kiem tra file co the doc");
			System.out.println("(3) Kiem tra file co the ghi");
			System.out.println("(4) In duong dan");
			System.out.println("(5) In ten file");
			System.out.println("(6) Kiem tra file la thu muc hay tap tin");
			System.out.println("(7) In danh sach file con");
			System.out.println("(8) In cay thu muc");
			System.out.println("(0) Thoat chuong trinh");
			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1:
				System.out.println(vdf.kiemTraThucThi());
				break;
			case 2:
				System.out.println(vdf.kiemTraDoc());
				break;
			case 3:
				System.out.println(vdf.kiemTraGhi());
				break;
			case 4:
				vdf.inDuongDan();
				break;
			case 5:
				vdf.inTen();
				break;
			case 6:
				vdf.kiemTraLaThuMucHoacTapTin();
				break;
			case 7:
				vdf.inDanhSachCacFileCon();
				break;
			case 8:
				vdf.inCayThuMuc();
				break;
			default:
				break;
			}

			sc.nextLine();

		} while (luaChon != 0);
	}
}