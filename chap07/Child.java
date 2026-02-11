package chap07;

public class Child extends Parent{
	// field
	private String name;
	boolean sw = true;
	
	// constructor
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
	@Override
	public void method1() {
		if(sw) {
			System.out.println("자식 메소드 호출");
			sw = false;
		} else {
			super.method1();
			sw = true;
		}
	}
	
	/* final로 정의 되어 사용불가
	@Override
    public final void method2() {
		
	}
	*/

}
