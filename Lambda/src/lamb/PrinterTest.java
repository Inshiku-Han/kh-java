package lamb;

public class PrinterTest {

	public static void main(String[] args) {
		Printable printer2 = new MyPrint();
		
		printer2.print();
		
		Printable a = new Printable() { //�͸� Ŭ���� (�޼ҵ� ������ �Ѱ�)
			
			@Override
			public void print() {
				System.out.println("�͸� ����Ʈ");
				
			}
			
		};
		
		a.print();
		
	}

}

interface Printable{
	void print();
}

class MyPrint implements Printable{

	@Override
	public void print() {
		System.out.println("���� ����Ʈ");
		
	}
	
}