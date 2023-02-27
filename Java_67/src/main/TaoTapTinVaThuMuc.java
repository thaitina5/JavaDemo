package main;

import java.io.File;
import java.io.IOException;

public class TaoTapTinVaThuMuc {
  public static void main (String[] args) {
    /* 
      Đường dẫn thư mục rên window dùng: \ 
      vidu: C:\\folder1\\folder2
      Trên mac và linux: /
      vidu: /folder1/folder2
    */
    
    File folder1 = new File("D:\\Document\\java project\\JavaDemo\\Java_66");
    File folder2 = new File("D:\\Document\\java project\\JavaDemo\\Java_67");
    System.out.println("Kiem tra folder co ton tai ko: "+folder1.exists());
    
    File d1 = new File("D:\\Document\\java project\\vidu1");
    d1.mkdir();
    
    File d2 = new File("D:\\Document\\java project\\vidu1\\vidu2\\vidu3");
    d2.mkdirs();
    
    //Tạo tập tin, nếu tập tin đã tồn tại thì code bỏ qua
    File file1 = new File("D:\\Document\\java project\\vidu1\\text.txt");
    try{
      file1.createNewFile();
    }catch(IOException e) {
      /*
        catch lỗi những trường hợp như:
        Ko có quyền tạo file, ổ cứng đầy, đường dẫn sai
      */
      e.printStackTrace();
    }
  }
}