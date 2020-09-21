package day13;

public class Sungjuk {
	private int korScore;
	private int engScore;
	private int mathScore;
	public Sungjuk() {}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public void getSungjukInfo(int korScore,int engScore,int mathScore) {
		setKorScore(korScore);
		setEngScore(engScore);
		setMathScore(mathScore);
	}
	
	public int getTotalScore() {
		return getKorScore()+getEngScore()+getMathScore();
	}
	public double getAvg() {
		return getTotalScore()/3.0;
	}
	@Override
	public String toString() {
		return "Sungjuk [korScore=" + getKorScore() + ", engScore=" + getEngScore() + ", mathScore=" + getMathScore() + "]";
	}
	
	
}
