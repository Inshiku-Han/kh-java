package for_while;

public class Test07 {

	public static void main(String[] args) {
		//1 ~ 100���� �� 3�� ����� ����

		int total = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			if(i % 3 == 0) {
				total++;
			}
		}
		System.out.println(total);
		
	}

}
