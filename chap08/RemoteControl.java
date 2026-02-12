package chap08;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10; // static final 생략
	public int MIN_VOLUME = 10;
	
	// 추상메소드
	public void turnOn(); // abstract 생략
	public void turnOff();
	public void setVolume(int volume);
}
