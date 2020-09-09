package if_switch;

public class Exam09 {

	public static void main(String[] args) {
		//삼항연산자
		int num = 5;
		int result = 0;
		if(num > 3) {
			result = 10;
		}else {
			result = 20;
		}
		
		result = (num > 3) ? 10 : 20; // 참이면 10, 거짓이면 20 대입
		
		System.out.println(result);
	}

}
