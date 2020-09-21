package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam05 {
public static void main(String[] args) {
	//Map<K,V>
	//key - value 데이터의 쌍으로 이루어져 있음. 고유번호, 자료의 형태
	Map<Integer, String> map = new HashMap<>();
	
	
	
	//데이터 저장
	map.put(45, "Brown");
	map.put(37, "James");
	map.put(23, "Martin");
	map.put(23, "Mart");
	
	
	//데이터 검색
//	System.out.println(map.get(45)); //map.get(K) - value값을 출력
//	map.remove(37);
//	System.out.println(map.get(37)); // 지우면 null로 초기화
//	System.out.println(map.get(23)); // key는 같은데 value가 다를 경우 마지막으로 저장된 데이터 출력
	
	//Map은 컬렉션을 인터페이스로 받고 있지 않아서 전체 출력방법을 달리한다.
	
	//key만 담고 있는 컬렉션 인스턴스 생성
	Set<Integer> ks = map.keySet(); //value말고 key만
	
	
	//전체 key값 출력
	for(int e : ks) {
		System.out.println(e);
	}
	System.out.println();
	//전체 value값 출력
	for(int e : ks) {
		System.out.println(map.get(e));
	}
	System.out.println();
	
	//iterator로 key와 value를 동시에 출력
	Iterator<Integer> ite = ks.iterator();
	while(ite.hasNext()) {
		int num = ite.next(); //기본자료형에 넣어줘야한다. 안그러면 출력갯수마다 key와 value가 매치되지 않는다.
		System.out.println("key = " + num);
		System.out.println("value = " + map.get(num));
	}
}
}
