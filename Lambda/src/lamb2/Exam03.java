package lamb2;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Exam03 {

	public static void main(String[] args) {
		
		//문자열 출력
		Consumer<String> con = s -> System.out.println(s.toString());
		con.accept("안녕하세요");
		
		//문자열의 길이
		Consumer<String> con1 = s -> System.out.println(s.length());
		con1.accept("안녕하세요");
		
		BiConsumer<String, String> bc = (str1, str2) -> System.out.println(str1.length() + str2.length());
		bc.accept("bdfq", "sdgsdg");	
	
		
	}

}
