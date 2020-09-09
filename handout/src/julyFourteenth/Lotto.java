package julyFourteenth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//미완성
public class Lotto {
	public static void main(String[] args) {
		// 919회차 로또 당첨번호
		List<Integer> lotto = new ArrayList<Integer>();
		lotto.add(9);
		lotto.add(14);
		lotto.add(17);
		lotto.add(18);
		lotto.add(35);
		lotto.add(42);
		lotto.add(44);

		// 내가 산 로또 번호
		Set<Integer> set = new HashSet<Integer>();

		int tryCnt = 0;
		while(true) {
			int checkCnt = 0;
			for (;;) {
				set.add((int) (Math.random() * 45 + 1));
				if (set.size() >= 6) {
					break;
				}
			}
			
			Set<Integer> set2 = new TreeSet<>(set);
			List<Integer> tryLotto = new ArrayList<Integer>(set2);
			
			for (int i : lotto) {
				for (int j : tryLotto) {
					if (i == j) {
						checkCnt++;
						break;
					}
				}
			}
			tryCnt++;
			if (tryCnt % 100000 == 0) {
				System.out.println(tryCnt + "번 시도중");
			}
			if (checkCnt == 6) {
				break;
			}
			
		}
		System.out.println("1등 당첨!!");
		System.out.println("구매 횟수 = " + tryCnt);
		System.out.println("구매 금액 = " + (tryCnt * 1000) + "원");
	}
}
