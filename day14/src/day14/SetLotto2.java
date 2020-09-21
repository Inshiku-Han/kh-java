package day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetLotto2 {
public static void main(String[] args) {
	Random rand = new Random();
	Set<Integer> set = new HashSet<Integer>();
	
	for(;;) { // for 무한루프
		int num = rand.nextInt(45) + 1;
		set.add(num);
		if(set.size()>=6) {
			break;
		}
	}
	Set<Integer> tree = new TreeSet<Integer>(set); // 오름차순 정렬
	List<Integer> list = new ArrayList<Integer>(tree); // 리스트에 넣어 배열화
	
	for(int e : list) {
		System.out.print(e + " ");
	}
	
		
}
}
