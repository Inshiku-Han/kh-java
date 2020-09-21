package Exercise7_17;

public class Unit {
	private int x;
	private int y;

	public Unit() {

	}

	public void move(int x, int y) { // 오버라이딩 때 자식의 접근제어자가 부모의 접근제어자보다 작으면 오류.
	}								 // 부모 public - 자식 protected이하 x       부모 private - 자식 private 이상 전부 가능. 동일해도 가능

	public void stop() {
	}
}

class Marine extends Unit { // 보병
	int x, y; // 현재 위치

	public Marine() {
	}

	public void move(int x, int y) { // 지정된 위치로 이동

	}

	public void stop() { // 현재 위치에 정지
	}

	void stimPack() { // 스팀팩을 사용
	}
}

class Tank extends Unit { // 탱크
	int x, y; // 현재 위치

	public Tank() {
	}

	public void move(int x, int y) { // 지정된 위치로 이동
	}

	public void stop() { // 현재 위치에 정지
	}

	void changeMode() { // 공격모드를 변환
	}
}

class Dropship extends Unit { // 수송선
	int x, y; // 현재 위치

	public Dropship() {
	}

	public void move(int x, int y) { // 지정된 위치로 이동
	}

	public void stop() { // 현재 위치에 정지
	}

	void load() { // 선택된 대상을 태운다
	}

	void unload() { // 선택된 대상을 내린다
	}
}