
public class GenericAdvance {
	public static <T> void peekBox(BoxBox<T> box){
		System.out.println(box);
	}
	public static void peekWBox(BoxBox<?> box) { //와일드카드
		System.out.println(box);
	}
	public static void main(String[] args) {
		peekBox(new BoxBox<>(123));
		peekWBox(new BoxBox<>("123"));
	}
}

class BoxBox<T>{
	private T t;

	public BoxBox() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoxBox(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "BoxBox [t=" + t + "]";
	}
	
}


class SteelBox<T> extends BoxBox<T>{
	public SteelBox(T t) {
		super.setT(t);
	}
}