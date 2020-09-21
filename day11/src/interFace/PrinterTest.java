package interFace;

public class PrinterTest {
public static void main(String[] args) {
//	SamsungPrinter sp = new SamsungPrinter();
//	sp.print();
//
//	LgPrinter lp = new LgPrinter();
//	lp.print();
	
	
	Printable sp = new SamsungPrinter(); // 인터페이스 명 = new 객체생성
	sp.print();
	
	
}
}
