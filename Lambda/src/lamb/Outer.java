package lamb;

public class Outer {
	public static void main(String[] args) {
		Out out1 = new Out();
		Out.Member o1m1 = out1.new Member(); //멤버클래스의 선언방법1
		Out.Member om2 = new Out().new Member(); //멤버클래스의 선언방법2
		
		
	}
	
	
	// 네스티드 클래스 1
	class RR { // 이너 클래스(멤버 클래스), NoN-static 네스티드 클래스

	}

	// 네스티드 클래스 2
	static class GG { // Static 네스티드 클래스
		
	}

	public void gg() {
		class TT { // 이너 클래스(로컬 클래스)

		}
	}

}

class Out {
	int num;

	class Member {

		public void add(int n) {
			num += n;

		}

		public int get() {

			return num;
		}
	}
}