package absTract;

public class Marine extends Unit {

	public void stimPack() {
	}

	@Override
	public void move() {

	}

	@Override
	public void stop() {

	}

}

class Tank extends Unit {

	public void changeMode() {
	}

	@Override
	public void move() {

	}

	@Override
	public void stop() {

	}
}

class DropShip extends Unit {

	public void load() {
	}

	public void unLoad() {
	}

	@Override
	public void move() {

	}

	@Override
	public void stop() {

	}
}

abstract class Unit {
	int x, y;

	public abstract void move();

	public abstract void stop();

}