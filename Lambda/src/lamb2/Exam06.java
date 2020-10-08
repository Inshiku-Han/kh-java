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

		System.out.println("���ϱ� = " + c);
		System.out.println("���� = " + d);
		System.out.println("���ϱ� = " + e);
		System.out.println("ū�� = " + f);
		System.out.println();
		
		// �Լ��� �������̽��� ����Ͽ� sum()�޼ҵ��� ����� �����غ���
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

//Mymath Ŭ���� ����. �������� ����� �����ϴ� Ŭ����.
//���ϱ�, ����, ���ϱ�(����, �ΰ��� ���ڷθ� ����.)�� �������� ����
//�Ű������� ���� �� ���� ū���� �����ϴ� ���
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
