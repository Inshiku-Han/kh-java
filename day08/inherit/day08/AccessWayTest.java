package day08;

public class AccessWayTest {
public static void main(String[] args) {
//	AccessWay a = new AccessWay();
//	AccessWay b = new AccessWay();
	AccessWay.num++; // 클래스.변수 형태로 스태틱 변수에 접근 . 객체를 생성하지 않아도 static에 접근 가능
//	System.out.println(a.num);
//	System.out.println(b.num);
	
	Math.random(); // 이거도 static 변수
	Math.max(2, 3);
	System.out.println(Math.max(2, 3));
}
}

class AccessWay{
	static int num; // 공용으로 사용하는 변수
	
	static { // static 초기화 구문
		num = 0;
	}
	public AccessWay() {
		
	}
}
