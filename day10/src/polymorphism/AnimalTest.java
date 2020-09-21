package polymorphism;

public class AnimalTest {
public static void main(String[] args) { // 폰테스트 먼저 보고 비교
	Animal[] ani = new Animal[5];
	ani[0] = new Cat();
	ani[1] = new Cat();
	ani[2] = new Dog();
	ani[3] = new Cow();
	ani[4] = new Cow();
	
	ani[0].sound(); //다형성+오버라이딩을 이용해 자식클래스의 메소드를 사용가능.
	ani[1].sound(); //부모 클래스로 자식 클래스 생성. 자식의 메소드 호출 가능.
	ani[2].sound();
	ani[3].sound();
	ani[4].sound();
}
}
