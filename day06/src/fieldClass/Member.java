package fieldClass;


public class Member {
	String name;
	String account;
	int password;
	
	public Member() {
		name = null;
		account = null;
		password = 0;
		
	
	}
	public void setInfor(String name, String account, int password) {
		this.name = name;
		this.account = account;
		this.password = password;
		
	}
	public String getName() {
		return name;
	}
	public String getAccount() {
		return account;
	}
	public int getPassword() {
		return password;
	}
	public void display() {
		System.out.println("이름 : " + getName());
		System.out.println("아이디 : " + getAccount());
		System.out.println("비밀번호 : " + getPassword());
	}
}
