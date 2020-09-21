package method;

public class Exam34 {
public static void main(String[] args) {
	//3. 정수 하나를 매개변수로 받아, 1 ~ 100까지의 수 중에서 매개변수로 받은 수의 배수를 출력하는 메소드를 만들고 호출해보세요.
	num(9);
}
public static void num(int a) {
	for(int i = 1; i < 100; i++) {
		if(i % a == 0) {
			System.out.println(i);
		}
	}
	
}
}
