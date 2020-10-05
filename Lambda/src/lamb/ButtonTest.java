package lamb;

public class ButtonTest {

	public static void main(String[] args) {

		Clickable button1 = new Button1();
		Clickable button2 = new Button2();
		Clickable button3 = new Button3();

		button1.click();
		button2.click();
		button3.click(); // 클래스 종속적인 메소드
		System.out.println("--------------------");

		Clickable btn1 = new Clickable() {

			@Override
			public void click() {
				System.out.println("버튼 1 익명");

			}
		}; // 익명 클래스 메소드(클래스 노 필요)
		Clickable btn2 = new Clickable() {

			@Override
			public void click() {
				System.out.println("버튼 2 익명");
			}
		};
		Clickable btn3 = () -> System.out.println("버튼 3 람다");// 람다(메소드 선언 노 필요)
		

		btn1.click();
		btn2.click();
		btn3.click();

	}

}

//클릭 실행 시 실행이 되는 interface 제공(메소드 무조건 하나)
@FunctionalInterface
interface Clickable {
	void click();
}

class Button1 implements Clickable {

	@Override
	public void click() {
		System.out.println("버튼 1");
	}

}

class Button2 implements Clickable {

	@Override
	public void click() {
		System.out.println("버튼 2");

	}

}

class Button3 implements Clickable {

	@Override
	public void click() {
		System.out.println("버튼 3");

	}

}