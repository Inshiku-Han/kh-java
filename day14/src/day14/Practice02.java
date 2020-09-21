package day14;
//문자열을 저장할 수 있는 리스트를 만들고 임의의 문자열을 5개 저장한다. 리스트에 저장된 모든 문자열의 길이의 합을 출력하세요(ex> "ab","frt"=>5)

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
