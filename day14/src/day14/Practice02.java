package day14;
//���ڿ��� ������ �� �ִ� ����Ʈ�� ����� ������ ���ڿ��� 5�� �����Ѵ�. ����Ʈ�� ����� ��� ���ڿ��� ������ ���� ����ϼ���(ex> "ab","frt"=>5)

import java.util.ArrayList;
import java.util.List;

public class Practice02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("abc");
		list.add("defg");
		list.add("hijkl");
		list.add("mnopqr");
		list.add("stuvwxy");
		int sum = 0;
		for(String e : list) {
			sum += e.length();
		}
		System.out.println(sum);
	}
}
