package Account;

public class Account {
	String name;
	int money;
	static double leverage; // ���� ����  Ŭ���� Account�ȿ� ������ Ŭ������ ���ԵǾ� ���� �ʴ�.
	
	static{ // ���� ���� �ʱ�ȭ ����
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
		this.money += money; // ����
	}
	
	public void display() {
		System.out.println("������ : " + name);
		System.out.println("�����ܾ� : " + money);
		System.out.println("���� : " + leverage);
		System.out.println();
	}
}
