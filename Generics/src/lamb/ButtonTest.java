package lamb;

public class ButtonTest {

	public static void main(String[] args) {

		Clickable button1 = new Button1();
		Clickable button2 = new Button2();
		Clickable button3 = new Button3();

		button1.click();
		button2.click();
		button3.click(); // Ŭ���� �������� �޼ҵ�
		System.out.println("--------------------");

		Clickable btn1 = new Clickable() {

			@Override
			public void click() {
				System.out.println("��ư 1 �͸�");

			}
		}; // �͸� Ŭ���� �޼ҵ�(Ŭ���� �� �ʿ�)
		Clickable btn2 = new Clickable() {

			@Override
			public void click() {
				System.out.println("��ư 2 �͸�");
			}
		};
		Clickable btn3 = () -> System.out.println("��ư 3 ����");// ����(�޼ҵ� ���� �� �ʿ�)
		

		btn1.click();
		btn2.click();
		btn3.click();

	}

}

//Ŭ�� ���� �� ������ �Ǵ� interface ����(�޼ҵ� ������ �ϳ�)
@FunctionalInterface
interface Clickable {
	void click();
}

class Button1 implements Clickable {

	@Override
	public void click() {
		System.out.println("��ư 1");
	}

}

class Button2 implements Clickable {

	@Override
	public void click() {
		System.out.println("��ư 2");

	}

}

class Button3 implements Clickable {

	@Override
	public void click() {
		System.out.println("��ư 3");

	}

}