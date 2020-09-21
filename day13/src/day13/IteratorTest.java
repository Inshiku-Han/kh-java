package day13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
public static void main(String[] args) {
	List<String> list = new LinkedList<>();
	list.add("자바");
	list.add("씨쁠쁠");
	list.add("파이썬");
	
	//반복자 Iterator
	Iterator<String> ite = list.iterator();
	while(ite.hasNext()) { // 다음 데이터가 있는가?
		String s = ite.next();
		System.out.println(s);
		ite.remove(); // 다 삭제. 잘 안씀
	}
}
}
