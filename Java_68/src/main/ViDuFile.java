package main;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
  File file;
  
  public ViDuFile(String tenFile){
    this.file = new File(tenFile);
  }
  
  public boolean kiemTraThucThi(){
    return this.file.canExecute();
  }
  
  public boolean kiemTraDoc(){
    return this.file.canRead();
  }
  
  public boolean kiemTraGhi(){
    return this.file.canWrite();
  }
  
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int luaChon = 0;
    System.out.println("Nhap ten file: ");
    String tenFile = sc.nextLine();
    ViDuFile vdf = new ViDuFile(tenFile);
    do{
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
      sc.nextLine();
      
    }while(luaChon!=0);
  }
}