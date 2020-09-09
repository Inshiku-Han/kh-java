package method;

public class Exam35 {
public static void main(String[] args) {
	//4. Math.random() 메소드를 활용하여 1~ 50의 수 중 랜덤한 정수를 리턴하는 메소드를 만들고 호출해보자.
	double  a = Math.random()*49+1;
	System.out.println(rand(a));
}

public static int rand(double a) {
	
	
	return (int)a;
}
}
