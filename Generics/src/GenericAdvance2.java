
public class GenericAdvance2 {
	public static void outSome(MyBox<? extends Toy> box) {//�� �޼ҵ忡�� ���������ϸ� �� ������
		Toy t = box.get();
		System.out.println(t);
//		box.set(t); ����
	}
	public static void inBox(MyBox<? super Toy> box, Toy t) {//�� �޼ҵ忡�� ���������ϸ� �� ������
		box.set(t);
		
//		Plastic p = box.get(); ����
//		Toy toy = box.get(); ����
	}
}



class MyBox<T>{
	private T ob;
	
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {
		return ob;
	}
}

class Plastic{
	
}

class Toy extends Plastic{
	public String toString() {
		return "I am a Toy";
	}
}

class Car extends Toy{
	
}

class Robot extends Toy{
	
}



