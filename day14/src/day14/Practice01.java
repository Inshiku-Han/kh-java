package day14;
//정수를 담을 수 있는 리스트를 만들고 임의의 정수 5개를 넣는다. 리스트에 저장된 정수중 3의 배수의 개수를 출력하는 프로그램

import java.util.ArrayList;
import java.util.List;

public class Practice01 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(23);
		list.add(33);
		list.add(26);
		list.add(36);
		int sum = 0;
		for(int e : list) {
			if(e % 3 ==0) {
				sum++;
			}
		}
		System.out.println(sum);
	}

	
}
