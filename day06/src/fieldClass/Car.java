package fieldClass;

public class Car {
	String brand; //������
	String carName; //������
	int carNumber; //������ȣ
	int price; //����
	String owner; //������
	
	public void setBrand(String a) { //�Ӽ��� �����ϴ� �޼ҵ�. aka ����
		brand = a;
	}
	public void setName(String a) {
		carName = a;
	}
	public void setNumber(int a) {
		carNumber = a;
	}
	public void setPrice(int a) {
		price = a;
	}
	public void setOwner(String a) {
		owner = a;
	}
	public void display() {
		System.out.println("������ :" + brand);
		System.out.println("������ :" + carName);
		System.out.println("������ȣ :" + carNumber);
		System.out.println("���� :" + price);
		System.out.println("������ :" + owner);
		
	}
}
