import java.util.ArrayList;
import java.util.List;

public class VOList<T extends MyVO> {
	List<T> list = new ArrayList<>();

	public void add(T t) {
		list.add(t);
	}

	public void get() {
		for(T e : list) {
			e.display();
		}
	}
}
