package method;

public class Exam06 {

	public static void main(String[] args) {
		int b = 20; //이 int b는 main메소드 안에서 선언. 메소드안에서 선언된 변수를 지역변수(local variable)이라 함
					//지역변수 중 기본자료형은 초기화 필요. ex)0, 0.0 등
		if(10 > 5) {
			int a = 10; //이 int a는 if문 안에서만 선언. if문 밖에서는 사용 불가
			System.out.println(a);
			System.out.println(b);
		}
//		System.out.println(a);
		System.out.println(b);
		
	}

}
