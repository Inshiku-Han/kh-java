package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//맵으로 학번과 학생이름을 각각 key와 value로 구성된 데이터를 만들자
//임의의 값으로 map에 5개의 데이터를 저장한다.
//해당 맵을 메소드의 매개변수로 전달하여
//value의 값만 list형태로 리턴하는 메소드를 만드세요.
public class Exam07 {
	public static void main(String[] args) {
		Exam08 a = new Exam08();
		Map<Integer, String> b = new HashMap<Integer, String>();

		b.put(1, "김");
		b.put(2, "이");
		b.put(3, "박");
		b.put(4, "최");
		b.put(5, "한");
		List<String> c = a.aaa(b);
		for (String e : c) {
			System.out.println(e);
		}
	}
}

class Exam08 {
	public List<String> aaa(Map<Integer, String> map) {
		// value값을 담을 list 생성
		List<String> list = new ArrayList<String>();

		// 매개변수로 들어온 map의 키값만 set타입으로 저장
		Set<Integer> keys = map.keySet(); // keyset() : map에 있는 key값 호출
		for (int e : keys) {
			String value = map.get(e);
			list.add(value);
		}
		return list;
	}
}