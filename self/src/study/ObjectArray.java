package study;

public class ObjectArray {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[100];
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			
		}
	}

}
