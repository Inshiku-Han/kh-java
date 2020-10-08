package lamb2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exam04 {
	public static void main(String[] args) {
		Function<String, Integer> fun = str -> str.length();

		System.out.println(fun.apply("abc"));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> list2 = new ArrayList<>(list);

		//removeIf ¸Þ¼Òµå
		list2.removeIf((num) -> num % 2 == 0);
		
		System.out.println(list2);
	}
}
