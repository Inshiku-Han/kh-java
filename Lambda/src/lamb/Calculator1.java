package lamb;

public class Calculator1 {

	public static void main(String[] args) {
		
		int num1 = 100, num2 = 50;
		
		Calculable sum = (c, d) -> System.out.println(c + d);
		sum.cal(num1, num2);

		Calculable sub = (c, d) -> System.out.println(c - d);
		sub.cal(num1, num2);
		
		Calculable mul = (c, d) -> System.out.println(c * d);
		mul.cal(num1, num2);
		
		Calculable div = (c, d) -> System.out.println(c / d);
		div.cal(num1, num2);
		
		
		
	}

}

@FunctionalInterface
interface Calculable{
	void cal(int a, int b);
}