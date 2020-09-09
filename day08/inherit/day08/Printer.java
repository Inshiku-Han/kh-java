package day08;

public class Printer {
	String model; // ¸ğµ¨¸í
	String brand; // Á¦Á¶»ç
	String interfaceType; // ÀÎÅÍÆäÀÌ½º Á¾·ù
	int paper; // ÀÎ¼â ¸Å¼ö
	int expaper; // ÀÎ¼â Á¾ÀÌ ÀÜ·®

	public Printer() {
		paper = 100;
	}

	public void print() {
		if(expaper > 0) {
		paper++;
		expaper--;
		}
	}
}




