package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
public static void main(String[] args) {
	String[] arr = {"�ڹ�","���ܻ�","���̽�"};
	 List<String> list = Arrays.asList(arr); // Arrays.asList(�迭) �޼ҵ�.
//	 arr�� ������ ����Ʈ�� ����. ��� ������ ���� �Ұ�
	 list = new ArrayList<>(list); // ���Ե� ����Ʈ�� ArrayList�� �ʱ�ȭ. ������ ���� ���� ����
	 for(String e : list) {
		 System.out.println(e);
	 }
}
}
