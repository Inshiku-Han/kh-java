
public class init {

	public static void main(String[] args) {
		// ���׸� : �ܺο��� Ŭ������ �ڷ����� ����

		Box<Apple> allBox = new Box<>();
		Box<Orange> allBox2 = new Box<>();
		
		allBox.set(new Apple());
		System.out.println(allBox.get());
		
		allBox2.set(new Orange());
		System.out.println(allBox2.get());
		
		
		Box<String> newBox = BoxFactory.makeBox("���ο� ����");
		
		System.out.println(newBox);
		
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

	@Override
	public String toString() {
		return "Box [t=" + t + "]";
	}
	

}
//���׸� �޼ҵ�
class BoxFactory {
	public static <T> Box<T> makeBox(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
}