package lamb2;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;
import java.util.function.UnaryOperator;

public class Exam06 {
	public static void main(String[] args) {
		Mymath math = new Mymath();
		int a = 5, b = 5, t = 5, u = 5;

		int c = math.add(a, b), d = math.sub(a, b), e = math.mul(a, b), f = math.bigOne(a, b);

		System.out.println("더하기 = " + c);
		System.out.println("빼기 = " + d);
		System.out.println("곱하기 = " + e);
		System.out.println("큰거 = " + f);
		System.out.println();
		
		// 함수형 인터페이스를 사용하여 sum()메소드의 기능을 구현해보자
		BiFunction<Integer, Integer, Integer> sum = (num1, num2) -> num1 + num2;
		System.out.println("BiFunction = " + sum.apply(t, u));
		
		ToIntBiFunction<Integer, Integer> sum1 = (num1, num2) -> num1 + num2;
		System.out.println("ToIntBiFunction = " + sum1.applyAsInt(t, u));
		
		BinaryOperator<Integer> sum2 = (num1, num2) -> num1 + num2;
		System.out.println("BinaryOperator = " + sum2.apply(t, u));
		
		IntBinaryOperator sum3 = (num1, num2) -> num1 + num2;
		System.out.println("IntBinaryOperator = " + sum3.applyAsInt(t, u));
		
		

	}
}

//Mymath 클래스 선언. 수학적인 기능을 제공하는 클래스.
//더하기, 빼기, 곱하기(정수, 두개의 숫자로만 연산.)의 연산결과를 리턴
//매개변수로 들어온 두 수중 큰값을 리턴하는 기능
class Mymath {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int bigOne(int a, int b) {
		return a > b ? a : b;
	}
}
