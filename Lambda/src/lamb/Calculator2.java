package lamb;

public class Calculator2 {

	public static void main(String[] args) {
		
		int num1 = 100, num2 = 50;
		
		Calculable1 sum = (c, d) -> System.out.println(c + d);
		sum.cal(num1, num2);

		Calculable1 sub = (c, d) -> System.out.println(c - d);
		sub.cal(num1, num2);
		
		Calculable1 mul = (c, d) -> System.out.println(c * d);
		mul.cal(num1, num2);
		
		Calculable1 div = (c, d) -> System.out.println(c / d);
		div.cal(num1, num2);
		
		
		
	}

}

@FunctionalInterface
interface Calculable1{
	void cal(int a, int b);
}