package lamb;

public class Outer {
	public static void main(String[] args) {
		Out out1 = new Out();
		Out.Member o1m1 = out1.new Member(); //���Ŭ������ ������1
		Out.Member om2 = new Out().new Member(); //���Ŭ������ ������2
		
		
	}
	
	
	// �׽�Ƽ�� Ŭ���� 1
	class RR { // �̳� Ŭ����(��� Ŭ����), NoN-static �׽�Ƽ�� Ŭ����

	}

	// �׽�Ƽ�� Ŭ���� 2
	static class GG { // Static �׽�Ƽ�� Ŭ����
		
	}

	public void gg() {
		class TT { // �̳� Ŭ����(���� Ŭ����)

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