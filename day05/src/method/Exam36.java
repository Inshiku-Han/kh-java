package method;

public class Exam36 {
public static void main(String[] args) {
	//4. 정수 하나를 매개변수로 받아, 매개변수가 짝수면 true, 홀수면 false를 리턴하는 메소드를 만들고 활용해보자.
	
	System.out.println(judge(99));
}


public static boolean judge(int a) {
	return a % 2 == 0 ? true : false;
}
}
