package dao;

import java.util.ArrayList;

import model.Khach;

public class KhachDAO implements DAOInterface<Khach> {
	
	public static KhachDAO getInstance() {
		return new KhachDAO();
	}
	
	@Override
	public int insert(Khach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Khach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Khach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Khach> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Khach selectById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Khach> selectByCondition(String Condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
