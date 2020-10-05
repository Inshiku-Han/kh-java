package lamb;

public class PrinterTest {

	public static void main(String[] args) {
		Printable printer2 = new MyPrint();
		
		printer2.print();
		
		Printable a = new Printable() { //익명 클래스 (메소드 무조건 한개)
			
			@Override
			public void print() {
				System.out.println("익명 프린트");
				
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
		System.out.println("마이 프린트");
		
	}
	
}