package if_switch;

public class Exam03 {

	public static void main(String[] args) {
		int a = 10;
		
		if(a > 5) {
			System.out.println("a는 5보다 큽니다.");
		}else {    // false일 경우 else를 출력
			System.out.println("a는 5보다 크지 않습니다.");
			}
		
		int b = 5;
		
		if(b > 5) {
			System.out.println("b는 5보다 큽니다.");
		}else  if(b < 5){
			System.out.println("b는 5보다 작습니다.");
		}else {
			System.out.println("b는 5입니다");
		} // if문, if (else)문, if else if (else) 문
		
		
	}

}
