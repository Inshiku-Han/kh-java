package instanceOf;

public class CarTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		Car c = new Car();
		// ���������� �ش� Ŭ������ ��ü�̰ų�,
		// Ȥ�� �ش� Ŭ������ ����ȯ�� �����ϸ� true...
		if (fe instanceof FireEngine) {
			System.out.println("�̰��� �ҹ����� ��ü");
		}

		if (fe instanceof Car) {
			System.out.println("�̰��� �ڵ����� ��ü");
		}
		if (c instanceof Ambulance) { // �ڽ����� �θ� ���� �Ұ�.
			System.out.println("!!!!!");
		}
	}
}
