package test;

import java.util.ArrayList;

import dao.KhachDAO;
import model.Khach;

public class TestKhachHangDAO {

	public static void main(String[] args) {
		ArrayList<Khach> list = KhachDAO.getInstance().selectAll();
		for (Khach kh : list) {
			System.out.println(kh.toString());
		}
	}

}
