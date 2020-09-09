package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
public static void main(String[] args) {
	String[] arr = {"자바","씨쁠쁠","파이썬"};
	 List<String> list = Arrays.asList(arr); // Arrays.asList(배열) 메소드.
//	 arr의 내용을 리스트에 대입. 대신 데이터 수정 불가
	 list = new ArrayList<>(list); // 대입된 리스트를 ArrayList로 초기화. 데이터 수정 변경 가능
	 for(String e : list) {
		 System.out.println(e);
	 }
}
}
