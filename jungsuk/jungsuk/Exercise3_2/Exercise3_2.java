package Exercise3_2;

public class Exercise3_2 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples / sizeOfBucket) + ((numOfApples % sizeOfBucket) > 0 ? 1 : 0); // �� + �������� �ִٸ� 1�߰�

		
		System.out.println("�ʿ��� �ٱ����� ����:" + numOfBucket);
	}

}
