package day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//리스트에 랜덤 메서드를 사용해서 10개의 데이터를 입력 1 ~ 100포함 정수
//리스트에 저장된 모든 데이터를 iterator을 써서 출력
public class RandomIterator {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	
	for(int i = 0 ; i < 10 ; i ++) {
		list.add((int)(Math.random()*100)+1);
	}
	Iterator<Integer> ite = list.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	
	
	
	
}
}
