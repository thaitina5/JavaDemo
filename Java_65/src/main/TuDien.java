package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;

public class TuDien {
  //private Map<String, String> duLieu = new HashMap<String, String>();
  private Map<String, String> duLieu = new TreeMap<String, String>();
  
  public String themTu(String tuKhoa, String yNghia){
    return this.duLieu.put(tuKhoa, yNghia);
  }
  
  public String xoaTu(String tuKhoa){
    return this.duLieu.remove(tuKhoa);
  }
  
  public String traTu(String tuKhoa){
    String yNghia = this.duLieu.get(tuKhoa);
    return yNghia;
  }
  
  public void inTuKhoa(){
    Set<String> tapHopTuKhoa = this.duLieu.keySet();
    System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
  }
  
  public int laySoLuong(){
    return this.duLieu.size();
  }
  
  public void xoaTatCa(){
    this.duLieu.clear();
  }
  
  public static void main (String[] args) {
    TuDien tuDien = new TuDien();
    Scanner sc = new Scanner(System.in);
    int luaChon = 0;
    do{
      System.out.println("=== SELECT OPTIONS ===");
      System.out.println("(1) Them tu khoa \n");
      System.out.println("(2) Xoa tu \n");
      System.out.println("(3) Tra tu \n");
      System.out.println("(4) In danh sach tu \n");
      System.out.println("(5) In so luong tu \n");
      System.out.println("(6) Xoa tat ca tu \n");
      luaChon = sc.nextInt();
      sc.nextLine();
      if(luaChon==1 || luaChon==2 || luaChon==3){
        System.out.println("Nhap tu khoa: ");
        String tuKhoa = sc.nextLine();
        if(luaChon==1) {
          System.out.println("Nhap y nghia: ");
          String yNghia = sc.nextLine();
          tuDien.themTu(tuKhoa, yNghia);
        } else if(luaChon==2) {
            tuDien.xoaTu(tuKhoa);
        } else if(luaChon==3) {
            tuDien.traTu("Y nghia la: "+tuKhoa);
        }
      } else if(luaChon==4) {
        System.out.println("Danh sach tu: ");
        tuDien.inTuKhoa();
      } else if(luaChon==5) {
        System.out.println("So luong tu: " + tuDien.laySoLuong());
      } else if(luaChon==6) {
        tuDien.xoaTatCa();
      } else if(luaChon==0) {
          break;
      }
    }while(luaChon!=0);
  }
  
  
  
  
  
}