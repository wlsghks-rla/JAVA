package chap07;

public class Parent {
	// field
	public String nation;
	final String house = "big";
			
	// constructor
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
	
	// method
	public void method1() {
		System.out.println("부모 메소드 호출");
	}
	
	public final void method2() {
		System.out.println("부모 메소드 호출");
	}	

}
