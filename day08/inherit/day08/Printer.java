package day08;

public class Printer {
	String model; // �𵨸�
	String brand; // ������
	String interfaceType; // �������̽� ����
	int paper; // �μ� �ż�
	int expaper; // �μ� ���� �ܷ�

	public Printer() {
		paper = 100;
	}

	public void print() {
		if(expaper > 0) {
		paper++;
		expaper--;
		}
	}
}




