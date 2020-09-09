package study;

public class Gugudan01 {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + " = " + i * j + " ");
			}
			System.out.println();//i가 1, j가 1부터 9가 될 때 까지 출력한 후 줄바꿈
		}
	}

}
