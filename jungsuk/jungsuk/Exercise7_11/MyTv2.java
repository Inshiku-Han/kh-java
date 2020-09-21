package Exercise7_11;

 class MyTv2 {
	private boolean isPoweron;
	private int channel;
	private int volume;
	private int PrevChannel;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public MyTv2() {
		
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		PrevChannel = this.channel; // 매개변수를 set 하기전 이전 값을 PrevChannel에 저장한다.
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	public void gotoPrevChannel() {
		setChannel(PrevChannel);
	}
}
