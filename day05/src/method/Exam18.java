package method;

public class Exam18 {
public static void main(String[] args) {
	//15. 두 정수를 매개변수로 받아, 두 정수가 모두 짝수이면 ‘두 수는 짝수입니다.’를 출력하고, 
	//한 정수만 짝수일 경우 ‘한 수만 짝수입니다.’를, 두 수 모두 홀수일 때는 ‘두 수는 홀수입니다.’
	//를 출력하는 메소드를 선언하고 호출해보세요.
	
	judge(3, 3);
}

public static void judge(int a, int b) {
	if(a % 2 == 0 && b % 2 == 0) {
		System.out.println("두 수는 짝수입니다.");
	} else if(a % 2 == 1 && b % 2 == 1) {
		System.out.println("두 수는 홀수입니다.");
		
	} else if(a % 2 == 0 || b % 2 == 0) {
		System.out.println("한 수만 짝수입니다.");
	}
}
}
