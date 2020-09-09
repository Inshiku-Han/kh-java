package arrayListInherit;

import java.util.ArrayList;
import java.util.List;

public class Student1Test {
	public static void main(String[] args) {
		Student1 stu1 = new Student1();
		List<Student1> list = new ArrayList<Student1>();
		
		stu1.getSungjukInfo(50, 30, 20);
		list.add(stu1); 
		System.out.println(list.get(0));
	}
}
