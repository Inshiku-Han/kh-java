
public class init {

	public static void main(String[] args) {
		// ���׸� : �ܺο��� Ŭ������ �ڷ����� ����

		Box<Apple> allBox = new Box<>();
		Box<Orange> allBox2 = new Box<>();
		
		allBox.set(new Apple());
		System.out.println(allBox.get());
		
		allBox2.set(new Orange());
		System.out.println(allBox2.get());
		
		
		
	}

}

class Apple {
	public String toString() {
		return "���";
	}
}

class Orange{
	public String toString() {
		return "������";
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

}