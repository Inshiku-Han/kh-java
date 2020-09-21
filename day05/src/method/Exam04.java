package method;

public class Exam04 {

	public static void main(String[] args) {
		int result = sum(1, 2); // sum(1,2)를 a+b라는 정수의 결과값을 갖기 위해 int return사용
		System.out.println(result);
		
		//double a = square(3.5);
		//System.out.println(a);
		
		System.out.println(square(3.5)); //위 두 줄과 동일(a변수없이 생성가능)
	}
	
	public static int sum(int a, int b) { // 메소드의 정수화
		int sum = a + b;
		return sum;
	}
	public static double square(double num) {
		//double value = num*num;
		//return value; //메소드 자료형 지정시 return필요
		
		return num*num; //위 두줄과 동일(value 변수없이 생성가능)
	}
	//메소드를 출력하라 : return사용x
	//특정 결과를 리턴or반환하라 : return사용
}
