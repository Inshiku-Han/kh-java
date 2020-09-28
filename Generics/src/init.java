
public class init {

	public static void main(String[] args) {
		// 제네릭 : 외부에서 클래스의 자료형을 지정

		Box<Apple> allBox = new Box<>();
		Box<Orange> allBox2 = new Box<>();
		
		allBox.set(new Apple());
		System.out.println(allBox.get());
		
		allBox2.set(new Orange());
		System.out.println(allBox2.get());
		
		
		Box<String> newBox = BoxFactory.makeBox("새로운 상자");
		
		System.out.println(newBox);
		
	}

}

class Apple {
	public String toString() {
		return "사과";
	}
}

class Orange{
	public String toString() {
		return "오렌지";
	}
}

class Box<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	@Override
	public String toString() {
		return "Box [t=" + t + "]";
	}
	

}
//제네릭 메소드
class BoxFactory {
	public static <T> Box<T> makeBox(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
}