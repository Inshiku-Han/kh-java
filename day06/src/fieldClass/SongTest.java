package fieldClass;

public class SongTest {
	public static void main(String[] args) {
		Song s = new Song();
		String[] a = new String[] {"��","��","��"};
		s.setTitle("�뷡");
		s.setArtist("�۸���");
		s.setAlbum("�뷡���");
		s.setYear(2020);
		s.setComposer(a); //��ȣ�ȿ��� �ٷ� new String[] {"��","��","��"} ���� ����
		s.display();
	}
	

}
