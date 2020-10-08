package lamb2;

import java.util.ArrayList;
import java.util.List;

public class Exam05 {
	public static void main(String[] args) {
		List<BoardVO> list = new ArrayList<>();
		list.add(new BoardVO("����1", "�ۼ���1"));
		list.add(new BoardVO("����2", "�ۼ���2"));
		list.add(new BoardVO("����3", "�ۼ���3"));
		
		//forEach�޼ҵ�(Consumer<T> �Լ�)
		list.forEach(vo-> System.out.println(vo));
		
	}
}


class BoardVO { // valueObject
	private String title;
	private String writer;

	public BoardVO() {
		super();
	}

	public BoardVO(String title, String writer) {
		super();
		this.title = title;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "BoardVO [title=" + title + ", writer=" + writer + "]";
	}

}