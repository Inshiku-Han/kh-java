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
		System.out.println("�̸� : " + getName());
		System.out.println("���̵� : " + getAccount());
		System.out.println("��й�ȣ : " + getPassword());
	}
}
