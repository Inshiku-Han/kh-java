package Account;

public class Account {
	String name;
	int money;
	static double leverage; // 공용 변수  클래스 Account안에 있으나 클래스에 포함되어 있지 않다.
	
	static{ // 공용 변수 초기화 구문
		leverage = 0.0;
	}
	public Account() {
	}

	public Account(String name, double leverage) {
		this.name = name;
		this.money = 10000;
		Account.leverage = leverage;
	}

	public void setMoney(int money) {
		this.money += money; // 축적
	}
	
	public void display() {
		System.out.println("계좌주 : " + name);
		System.out.println("예금잔액 : " + money);
		System.out.println("이율 : " + leverage);
		System.out.println();
	}
}
