package lamda;

public class ActionMain {

	public static void main(String[] args) {
		
		// 익명객체
		action(new Calculater() {
			public void calc(int x, int y) {
				int result = x + y;
				System.out.println(result);
			}
		});
		
		// 람다식
		action((x,y) -> {
			int result = x + y;
			System.out.println(result);
		});
		
		action((x,y) -> {
			int result = x - y;
			System.out.println(result);
		});
		
		action((x,y) -> {
			int result = x * y;
			System.out.println(result);
		});
		
		action((x,y) -> {
			int result = x / y;
			System.out.println(result);
		});

	}
	
	private static void action(Calculater calc) {
		int x = 30;
		int y = 20;
		calc.calc(x,y);
	}

}
