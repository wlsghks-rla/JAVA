package chap06;

public class Singleton {
	// 싱글톤: 전체에서 객체 1개만 만드는 기법
	
	// field(자신의 객체 생성해서 저장)
	private static Singleton st = new Singleton();
	
	// constructor
	private Singleton() {}
	
	// method
	public static Singleton getInstance() {
		return st;
	}

}
