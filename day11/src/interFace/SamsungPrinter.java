package interFace;

public class SamsungPrinter implements Printable{
	public void print() {
		System.out.println("�Ｚ�����ͷ� ���");
	}
	
}


class LgPrinter implements Printable{
	@Override
	public void print() {
		System.out.println("���������ͷ� ���");
		
		
	}
}
interface Printable{
	void print();
}