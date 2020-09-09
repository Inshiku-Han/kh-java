package method;

public class Exam13 {
public static void main(String[] args) {
	//9. 이름을 매개변수로 받아 이름을 출력하는 메소드, 나이를 매개변수로 받아 나이를 출력하는 메소드, 
	//주소를 매개변수로 받아 주소를 출력하는 메소드를 각각 만들고 출력결과가 아래와 같게 프로그래밍하세요.
//	- 출력결과 예시-
//	이름은 김형진입니다.
//	나이는 33살입니다.
//	주소는 울산입니다.
	name("한인식");
	age(26);
	adress("울산");
}
public static void name(String a) {
	System.out.println("이름은 " + a + "입니다.");
}
public static void age(int a) {
	System.out.println("나이는 " + a + "입니다.");
}
public static void adress(String a) {
	System.out.println("주소는 " + a + "입니다.");
}
}
