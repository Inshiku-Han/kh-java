package polymorphism;

public class AnimalTest {
public static void main(String[] args) { // ���׽�Ʈ ���� ���� ��
	Animal[] ani = new Animal[5];
	ani[0] = new Cat();
	ani[1] = new Cat();
	ani[2] = new Dog();
	ani[3] = new Cow();
	ani[4] = new Cow();
	
	ani[0].sound(); //������+�������̵��� �̿��� �ڽ�Ŭ������ �޼ҵ带 ��밡��.
	ani[1].sound(); //�θ� Ŭ������ �ڽ� Ŭ���� ����. �ڽ��� �޼ҵ� ȣ�� ����.
	ani[2].sound();
	ani[3].sound();
	ani[4].sound();
}
}
