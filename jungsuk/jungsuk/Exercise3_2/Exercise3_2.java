package Exercise3_2;

public class Exercise3_2 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples / sizeOfBucket) + ((numOfApples % sizeOfBucket) > 0 ? 1 : 0); // 몫 + 나머지가 있다면 1추가

		
		System.out.println("필요한 바구니의 개수:" + numOfBucket);
	}

}
