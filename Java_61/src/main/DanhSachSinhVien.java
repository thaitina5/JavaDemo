package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSachSV;

	public DanhSachSinhVien() {
		this.danhSachSV = new ArrayList<SinhVien>();
	}
	
	public DanhSachSinhVien(ArrayList<SinhVien> danhSachSV) {
		this.danhSachSV = danhSachSV;
	}
	
	
	public void themSinhVien(SinhVien sv) {
		this.danhSachSV.add(sv);
	}
	
	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : danhSachSV) {
			System.out.println(sinhVien);
		}
	}
	
	public boolean kiemTraDanhSachRong() {
		return this.danhSachSV.isEmpty();
	}
	
	public int laySoLuongSinhVien() {
		return this.danhSachSV.size();
	}
	
	public boolean lamRongDanhSach() {
		return this.danhSachSV.removeAll(danhSachSV);
	}
	
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSachSV.contains(sv);
	}
	
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSachSV.remove(sv);
	}
	
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSachSV) {
			if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
				System.out.println(sinhVien);
			}
		}
	}
	
	public void sapXepDiemGiamDan() {
		Collections.sort(this.danhSachSV, new Comparator<SinhVien>(){
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
					return 1;
				} else if(sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
					return -1;
				} else {
					return 0;
				}
			}
			
		});
	}
	
	
}
