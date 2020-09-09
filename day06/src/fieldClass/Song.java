package fieldClass;
//14. 아래의 조건을 보고 노래를 나타내는 Song 클래스를 만들어 보세요. 
//Song 클래스는 다음과 같은 필드를 갖는다.
// - 노래 제목을 나타내는 title / - 가수를 나타내는 artist
// - 노래가 속한 앨범 제목을 나타내는 album /   - 노래가 발표된 연도를 나타내는 year
// - 노래의 작곡가를 나타내는 composer, 단 작곡가는 3명이라고 간주한다.
//15.  모든 필드를 초기화하는 메소드와 노래의 정보를 출력하는 메소드를 만드세요. 그리고 프로그램이 잘 돌아가는지 확인해 보세요.
public class Song {
	String title;
	String artist;
	String album;
	int year;
	String[] composer;
	
	public void setTitle(String a) {
		title = a;
	}
	public void setArtist(String a) {
		artist = a;
	}
	public void setAlbum(String a) {
		album = a;
	}
	public void setYear(int a) {
		year = a;
	}
	public void setComposer(String[] a) {
		composer = a;
	}
	public void display() {
		System.out.println("노래 제목 : " + title);
		System.out.println("가수 : " + artist);
		System.out.println("앨범 제목 : " + album);
		System.out.println("발표연도 : " + year + "년");
		for(String e : composer) {
			System.out.println("작곡가 : " + e);
		}
	}
}
