package day14;
//������ ���� �� �ִ� ����Ʈ�� ����� ������ ���� 5���� �ִ´�. ����Ʈ�� ����� ������ 3�� ����� ������ ����ϴ� ���α׷�

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
