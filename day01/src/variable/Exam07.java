package variable;

public class Exam07 {

	public static void main(String[] args) {
//		자동 형변환
		int a = 10;
		double b = 1.1;
			b = a;
		System.out.println(b);
			
		int num1 = 50;
		long num2 = 1111111111L;
//		int x = num1 + num2;  연산이 되는 자료형이 다르면 더 큰 쪽으로 변환시켜 연산
		long y = (num1 + num2);
		System.out.println(num1 + num2);
		System.out.println(y);
		
//		int val1 = 10/2;
//		int val2 = 10/3;
//		int val3 = 10/3.0;
//		double val4 = 10/3.0;
		
//		int val5 = (int)1.1;
//		int val6 =(int)(10/3.0);
	}

}
