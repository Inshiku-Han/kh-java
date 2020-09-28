
public class GenericAdvance2 {
	public static void outSome(MyBox<? extends Toy> box) {//겟 메소드에서 상한제한하면 셋 막아짐
		Toy t = box.get();
		System.out.println(t);
//		box.set(t); 오류
	}
	public static void inBox(MyBox<? super Toy> box, Toy t) {//셋 메소드에서 하한제한하면 겟 막아짐
		box.set(t);
		
//		Plastic p = box.get(); 오류
//		Toy toy = box.get(); 오류
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



