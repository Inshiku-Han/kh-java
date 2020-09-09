package method;

public class Exam02 {
	public static void main(String[] args) {
		hello(26, 170.3); //매개변수의 자료형을 맞춰줘야함
		
		
		int a =30;
		double b = 180.5;
		hello(a,b); //변수를 이용하는 것도 가능   메소드는 자동완성 가능
	}

	public static void hello(int age, double height) { //매개변수가 두개인 메소드
		System.out.println("제 나이는 " + age);
		System.out.println("키는 " + height);
	}
}
