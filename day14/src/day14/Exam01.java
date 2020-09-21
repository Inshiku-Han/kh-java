package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam01 {
public static void main(String[] args) {
	//HashSet
	//Ctrl + Shift + O : 필요한 import 자동 호출
	Set<String>	set = new HashSet<>();
	
	set.add("Toy");
	set.add("Box");
	set.add("Robot");
	set.add("Robot"); // 중복은 안들어가
	set.remove("Box"); // 오브젝트타입만 입력가능. string이나 클래스 등
	
	System.out.println("저장된 데이터의 수 :" + set.size());
	System.out.println();
	for(String e : set) { // 일반 for문으로는 출력 불가. Set에는 순서의 개념이 없다
		System.out.println(e); // 무작위로 저장된 것을 출력
	}
	System.out.println();
	
	Iterator<String> ite = set.iterator();
	while(ite.hasNext()) {
		String s = ite.next();
		System.out.println(s);
	}
}
}
