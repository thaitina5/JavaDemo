package dao;

import java.util.ArrayList;

import model.Sach;

public class SachDAO implements DAOInterface<Sach> {
	//công dụng hàm này là để đỡ phải new, gọi getInstance 
	//rồi sử dụng luôn các method bên dưới
	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int insert(Sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sach selectById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String Condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
