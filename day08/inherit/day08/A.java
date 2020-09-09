package day08;
 // 상속
public class A {
	int x;
	
}

class B extends A{
	int y;
}


class C extends B{ // 상속은 하나만 가능
	int z;
}

// 클래스간의 관계는 상속과 포함을 따져서 생각한다.
// 상속관계 - is-a ~은 ~이다.    ex)원은 점이다.   <-부자연스럽다
// 포함관계 - has-a ~은 ~을 가지고 있다. ex)원은 점을 가지고 있다 <-자연스럽다
