package Account;

public class AccountTest {
	//static�� Ȱ���غ���
	public static void main(String[] args) {
		Account a1 = new Account("������", 3);
		a1.display();
		
		
		Account a2 = new Account("������",10);
		a2.display();

		Account.leverage = 20; // AccountŬ�����ȿ� �ִ� ���뺯�� leverage�� 20�� �ʱ�ȭ. �������� ���Ǵ� ���� �� �� ����
		a1.display();
		a2.display();
	}

}
