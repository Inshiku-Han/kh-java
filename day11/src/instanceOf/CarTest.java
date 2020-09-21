package instanceOf;

public class CarTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		Car c = new Car();
		// 참조변수가 해당 클래스의 객체이거나,
		// 혹은 해당 클래스로 형변환이 가능하면 true...
		if (fe instanceof FireEngine) {
			System.out.println("이것은 소방차의 객체");
		}

		if (fe instanceof Car) {
			System.out.println("이것은 자동차의 객체");
		}
		if (c instanceof Ambulance) { // 자식으로 부모 생성 불가.
			System.out.println("!!!!!");
		}
	}
}
