package interFace;

public interface PlayingCard {
	/*public static final �����Ǿ��ִ�*/int spade = 4;
	/*public abstract �����Ǿ��ִ�*/String getnumber();
	
	
}

interface B{
	void print();
}

class A extends Object implements PlayingCard,B{

	@Override
	public String getnumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	
}
