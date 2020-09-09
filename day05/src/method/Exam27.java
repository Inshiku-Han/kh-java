package method;

public class Exam27 {
public static void main(String[] args) {
	//5. 임의의 정수를 매개변수로 받아, 만약 매개변수로 받은 정수가 90 이상이면 ‘A’, 70 이상이면 ‘B’
	//   그 외의 수가 들어오면 ‘C’를 리턴하는 메소드를 선언하고 사용해보세요.
	
	System.out.println(score(30)); //임의의 정수
}

public static String score(int a) {
	String b = null;
	if(a >= 90) {
		b = "A";
	}else if(a >= 70) {
		b = "B";
	}else {
		b = "C";
	}
	return b;
}

}
