package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// 키보드로 나라 이름과 인구를 3개받아 저장하고 다시 나라 이름을 키보드로 입력받아 인구를 출력
public class Nation {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("나라 이름 : ");
			String nation = sc.nextLine();
			System.out.println("인구수 : ");
			int num = sc.nextInt();
			sc.nextLine();
			map.put(nation, num);
		}
		
		System.out.println("나라 이름 : ");
		String searchNation = sc.nextLine();
		
		Set<String> keys = map.keySet();
		for(String e : keys) {
			if(e.equals(searchNation)) {
				System.out.println(map.get(e));
			}
		}
		sc.close();
	}
}
