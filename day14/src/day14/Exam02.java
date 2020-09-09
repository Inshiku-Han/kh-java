package day14;

import java.util.Set;
import java.util.TreeSet;

public class Exam02 {
public static void main(String[] args) {
	//TreeSet
	Set<Integer> set = new TreeSet<Integer>();
	// set 내에서 비교해서 크기에 대한 오름차순으로 정렬
	set.add(3);
	set.add(1);
	set.add(2);
	set.add(4);
	set.add(4); // 중복 허용 x
	
	System.out.println("데이터 수 : " + set.size());
	System.out.println();
	
	for(int e : set) {
		System.out.println(e + " ");
		}
	}
}
