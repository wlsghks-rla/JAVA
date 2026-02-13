package chap09;

public class AnonymousExam460 {

	public static void main(String[] args) {
		Anonymous460 anony = new Anonymous460();
		
		anony.field.start();
		
		anony.method1();
		
		anony.method2(new Worker() {
			public void start() {
				System.out.println("테스트를 합니다.");
			}
			
		  }
		
		);		

	}

}
