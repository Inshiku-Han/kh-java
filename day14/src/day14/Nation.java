package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Ű����� ���� �̸��� �α��� 3���޾� �����ϰ� �ٽ� ���� �̸��� Ű����� �Է¹޾� �α��� ���
public class Nation {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("���� �̸� : ");
			String nation = sc.nextLine();
			System.out.println("�α��� : ");
			int num = sc.nextInt();
			sc.nextLine();
			map.put(nation, num);
		}
		
		System.out.println("���� �̸� : ");
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
