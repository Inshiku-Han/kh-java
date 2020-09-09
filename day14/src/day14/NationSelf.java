package day14;

import java.util.HashMap;
import java.util.Scanner;

public class NationSelf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nation = new HashMap<String, Integer>();
	
		while(true) {
			System.out.print("입력 : ");
			String name = sc.nextLine();
			int pop = sc.nextInt();
			nation.put(name, pop);
			
			if(nation.size()>=3) {
				sc.nextLine();
				System.out.print("나라 명 : ");
				String name2 = sc.nextLine();
				System.out.println(nation.get(name2));
				break;
			}
			sc.nextLine();
		}

		sc.close();
	}
}
