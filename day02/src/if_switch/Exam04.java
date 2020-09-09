package if_switch;

public class Exam04 {
	public static void main(String[] args) {
		int num = 5;
		//num이 5보다 크고 20보다 작으면 *를 출력
		//위의 조건이 만족하지 않으면 !를 출력
		if(num > 5) {
			if (num < 20) {
				System.out.println("*");
			}
		}else {
			System.out.println("!");
		}
		if(num > 5 && num < 20) {
			System.out.println("*");
		}else {
			System.out.println("!");
		}
	}
}
