package lamb2;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Exam03 {

	public static void main(String[] args) {
		
		//���ڿ� ���
		Consumer<String> con = s -> System.out.println(s.toString());
		con.accept("�ȳ��ϼ���");
		
		//���ڿ��� ����
		Consumer<String> con1 = s -> System.out.println(s.length());
		con1.accept("�ȳ��ϼ���");
		
		BiConsumer<String, String> bc = (str1, str2) -> System.out.println(str1.length() + str2.length());
		bc.accept("bdfq", "sdgsdg");	
	
		
	}

}
