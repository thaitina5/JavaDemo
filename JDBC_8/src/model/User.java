package model;

public class User {
	String userName;
	String passWord;
	String hoVaTen;
	
	public User() {
		super();
	}

	public User(String userName, String passWord, String hoVaTen) {
		this.userName = userName;
		this.passWord = passWord;
		this.hoVaTen = hoVaTen;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", hoVaTen=" + hoVaTen + "]";
	}
	
	
}
