package fieldClass;

public class SongTest {
	public static void main(String[] args) {
		Song s = new Song();
		String[] a = new String[] {"고","양","이"};
		s.setTitle("노래");
		s.setArtist("멍멍이");
		s.setAlbum("노래목록");
		s.setYear(2020);
		s.setComposer(a); //괄호안에서 바로 new String[] {"고","양","이"} 선언도 가능
		s.display();
	}
	

}
