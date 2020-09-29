package lamb;

public class Calculator3 {

	public static void main(String[] args) {
		
		int num1 = 100, num2 = 50;
		
		Calculable2 sum = (c, d) -> c + d;
		System.out.println(sum.cal(num1, num2));

		Calculable2 sub = (c, d) -> c - d;
		System.out.println(sub.cal(num1, num2));
		
		Calculable2 mul = (c, d) -> c * d;
		System.out.println(mul.cal(num1, num2));
		
		Calculable2 div = (c, d) -> c / d;
		System.out.println(div.cal(num1, num2));
		
		
		
	}

}

@FunctionalInterface
interface Calculable2{
	int cal(int a, int b);
}