package interFace;

public class SamsungPrinter implements Printable{
	public void print() {
		System.out.println("삼성프린터로 출력");
	}
	
}


class LgPrinter implements Printable{
	@Override
	public void print() {
		System.out.println("엘지프린터로 출력");
		
		
	}
}
interface Printable{
	void print();
}