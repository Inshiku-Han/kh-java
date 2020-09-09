package testInterface;

public class Tank extends GroundUnit implements Repairable{
	public Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
}

class Marine extends GroundUnit{
	public Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	public SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	//기계만 수리할 수 있다
	public void repair(Repairable r) {
		
	}
	
	
	
}
