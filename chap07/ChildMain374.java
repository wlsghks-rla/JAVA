package chap07;

public class ChildMain374 {
	public static void method1(Parent373 parent) {
		if(parent instanceof Child373) {
			Child373 child = (Child373) parent;
			System.out.println("변환 성공");
		}else {
			System.out.println("변환 실패");
		}
	}
	
	public static void method2(Parent373 parent) {
		Child373 child = (Child373) parent;
		System.out.println("변환 성공");
	}

	public static void main(String[] args) {
		Parent373 parent = new Child373();
		method1(parent);
		method2(parent);
		
		Parent373 parent2 = new Parent373();
		method1(parent2);
		method2(parent2);
		

	}

}
