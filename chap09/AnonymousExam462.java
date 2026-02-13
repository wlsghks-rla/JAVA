package chap09;

public class AnonymousExam462 {

	public static void main(String[] args) {
		Anonymous461 anony = new Anonymous461();
		
		anony.field.run();
		
		anony.method1();
		
		anony.method2(
				new Vehicle() {
					public void run() {
						System.out.println("트럭이 달립니다.");
					}
				}
			);
		

	}

}
