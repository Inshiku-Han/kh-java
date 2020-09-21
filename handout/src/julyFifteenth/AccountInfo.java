package julyFifteenth;

class AccountInfo {
	private String myNumber;
	private String accountNumber;
	private int money;

	public AccountInfo() {
		this.money = 10000;
	}
	public AccountInfo(String myNumber, String accountNumber) {
		this.myNumber = myNumber;
		this.accountNumber = accountNumber;
		this.money = 10000;
	}
	public String getMyNumber() {
		return myNumber;
	}
	public void setMyNumber(String myNumber) {
		this.myNumber = myNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return " 계좌번호 : " + accountNumber + " 예금액 : " + money;
	}
	
}
