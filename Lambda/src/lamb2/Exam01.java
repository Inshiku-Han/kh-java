package lamb2;

public class Exam01 {
	public static void main(String[] args) {
		HowLong<String, Integer> h = (a, b) -> a.length() + b.length();
		System.out.println(h.getLength("abc", "def"));

		
	}
}

@FunctionalInterface
interface HowLong<T, R> {
	R getLength(T a, T b);
}
