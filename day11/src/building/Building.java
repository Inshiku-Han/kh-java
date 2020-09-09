package building;

public class Building {
	public void liftOff() {}
	public void move(int x, int y) {}
	public void stop() {}
	public void land() {}
}

class LiftableImp implements Liftable{

	@Override
	public void liftOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}
}

class Barrack extends Building implements Liftable{
	LiftableImp l = new LiftableImp();
	public void liftOff() {l.liftOff();}
	public void move(int x, int y) {l.move(x, y);}
	public void stop() {l.stop();}
	public void land() {l.land();}
	public void trainMarine() {}
}

class Factory extends Building implements Liftable{
	LiftableImp l = new LiftableImp();
	public void liftOff() {l.liftOff();}
	public void move(int x, int y) {l.move(x, y);}
	public void stop() {l.stop();}
	public void land() {l.land();}
	public void makeTank() {}
}
