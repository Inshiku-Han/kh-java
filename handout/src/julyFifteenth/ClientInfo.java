package julyFifteenth;

public class ClientInfo{
	private String name;
	private String myNumber;
	private String phoneNumber;
	private AccountInfo account;
	public ClientInfo() {
	}
	
	public ClientInfo(String name, String myNumber, String phoneNumber, AccountInfo account) {
		this.name = name;
		this.myNumber = myNumber;
		this.phoneNumber = phoneNumber;
		this.account = account;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMyNumber() {
		return myNumber;
	}
	public void setMyNumber(String myNumber) {
		this.myNumber = myNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public AccountInfo getAccount() {
		return account;
	}
	public void setAccount(AccountInfo account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "이름 : " + name + " 주번 : " + myNumber + " 연락처 : " + phoneNumber + account;
	}
	
}