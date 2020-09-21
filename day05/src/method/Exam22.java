package method;

public class Exam22 {
public static void main(String[] args) {
	//19. 한 문자열과 정수를 매개변수로 받아, 
	//매개변수로 받은 문자열을 매개변수로 받은 숫자만큼 반복 출력하는 메소드를 선언하고 호출해보세요.
	name("ㅋ", 30);
}

public static void name(String a, int b) {
	for(int i = 0; i < b; i++) {
		System.out.print(a);
	}
	
}
}
