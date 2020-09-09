package testInterface;

interface Repairable{
	
}
public class Unit {
	int hitPoint;
	final int MAX_HP;

	public Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {

	public GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {

	public AirUnit(int hp) {
		super(hp);
	}
}
