package fieldClass;
	//������ : �ʵ带 �ʱ�ȭ������. Ŭ���� ������ �ʼ�
public class Bank {
	// ���¹�ȣ, �̸�, �����ܾ�
	String accNumber;
	String name;
	int balance; //�ʵ带 �ʱ�ȭ����� �ϳ� �ʵ带 �ٷ� �ʱ�ȭ �ϴ°� ������.

	public Bank(/*int a*/) { //������. �����ڿ� �Ű����� ����� ȣ���� �� ���� �����������
		accNumber = null;	 //�����ڸ� ���� ��� : ó������ ���� ������ ���. �����ڰ� ���� ��� ����Ʈ�����ڸ� �ڵ����� ����(�Ⱥ���)
		name = null;		//�������� �̸��� Ŭ������ �̸��� ���ƾ� �Ѵ�.
		balance = 0;
		
	}

	public void setAcc(String accNumber, String name, int balance) { // setter
		this.accNumber = accNumber; //this.������ �ʵ带 �ǹ�. �޼ҵ� �� ������ �������� ���� this.���
		this.name = name; // �� �޼ҵ忡 �ִ� name������ �� Ŭ������ �ִ� name�� �����ÿ�    ��� ��
		this.balance = balance;
	}
	
}
