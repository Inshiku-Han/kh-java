package fieldClass;
//14. �Ʒ��� ������ ���� �뷡�� ��Ÿ���� Song Ŭ������ ����� ������. 
//Song Ŭ������ ������ ���� �ʵ带 ���´�.
// - �뷡 ������ ��Ÿ���� title / - ������ ��Ÿ���� artist
// - �뷡�� ���� �ٹ� ������ ��Ÿ���� album /   - �뷡�� ��ǥ�� ������ ��Ÿ���� year
// - �뷡�� �۰�� ��Ÿ���� composer, �� �۰�� 3���̶�� �����Ѵ�.
//15.  ��� �ʵ带 �ʱ�ȭ�ϴ� �޼ҵ�� �뷡�� ������ ����ϴ� �޼ҵ带 ���弼��. �׸��� ���α׷��� �� ���ư����� Ȯ���� ������.
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
		System.out.println("�뷡 ���� : " + title);
		System.out.println("���� : " + artist);
		System.out.println("�ٹ� ���� : " + album);
		System.out.println("��ǥ���� : " + year + "��");
		for(String e : composer) {
			System.out.println("�۰ : " + e);
		}
	}
}
