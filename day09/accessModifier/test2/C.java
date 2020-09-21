package test2;

import test1.A;

public class C { // 다른 패키지에서도 접근 가능. public class는 반드시 파일명과 같아야한다. public class는 파일당 하나만 가능하다.
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
//		System.out.println(a.b); // 다른 패키지라서 접근 불가
		
	}
}
class Cc extends A{ // 같은 패키지내에서만 접근 가능
	public void aa() {
	}
	
}
