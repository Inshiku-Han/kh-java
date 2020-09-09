package day13;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(6);
		list.add(9);
		
		for(int e : list) {
			System.out.println(e);
		}
		System.out.println();
		list.remove(3);
		for(int e : list) {
			System.out.println(e);
		}
 	}
}
