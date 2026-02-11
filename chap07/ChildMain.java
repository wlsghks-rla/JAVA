package chap07;

public class ChildMain {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1();	
		child.method1();	
		child.method1();	
		child.method1();
		
		System.out.println(child.house);
		child.method2(); // 사용은 가능 재정의 불가.
		
		
		System.out.println(child.house);
		
//		super.method1(); 컴파일 에러


	}

}
