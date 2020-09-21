package fieldClass;

public class Car {
	String brand; //제조사
	String carName; //차량명
	int carNumber; //차량번호
	int price; //가격
	String owner; //소유주
	
	public void setBrand(String a) { //속성을 변경하는 메소드. aka 세터
		brand = a;
	}
	public void setName(String a) {
		carName = a;
	}
	public void setNumber(int a) {
		carNumber = a;
	}
	public void setPrice(int a) {
		price = a;
	}
	public void setOwner(String a) {
		owner = a;
	}
	public void display() {
		System.out.println("제조사 :" + brand);
		System.out.println("차량명 :" + carName);
		System.out.println("차량번호 :" + carNumber);
		System.out.println("가격 :" + price);
		System.out.println("소유주 :" + owner);
		
	}
}
