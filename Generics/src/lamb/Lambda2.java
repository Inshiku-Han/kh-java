package lamb;

public class Lambda2 {

	public static void main(String[] args) {

		Printable5 print = str -> System.out.println(str);

		print.print("���ٶ���");

		
		
	}

}

@FunctionalInterface
interface Printable5 {
	void print(String s);
}

