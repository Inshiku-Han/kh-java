package lamb;

public class Lambda1 {

	public static void main(String[] args) {

		SmartPrintable print = s -> System.out.println(s);

		print.print("À¸¾Æ¾Æ");

		Sumable sum = (a, b) -> a + b;

		System.out.println(sum.getSum(10, 20));
	}

}

@FunctionalInterface
interface SmartPrintable {
	void print(String s);
}

@FunctionalInterface
interface Sumable {
	int getSum(int a, int b);
}