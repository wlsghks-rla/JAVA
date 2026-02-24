package 김진환1;

public class test {

	public static void main(String[] args) {
		
		// 1
		int num1 = 5;
		int num2 = 2;
		
		double result = (double)num1/ num2;
		
		System.out.println(result);
		
		// 3
		String name = "홍길동";
		int age = 22;
		double weight = 60.5;
				
		System.out.printf("이름은 %s, 나이는 %d세, 몸무게는 %.1f입니다\n", name, age, weight);
		
		// 4
		int randomNum = (int)(Math.random() * 16 + 5);
		
		System.out.println(randomNum);
		
		// 5
		int number = 0; 
		if(number % 7 == 0) {
			System.out.println(number % 7 == 0 );
		} else {
			System.out.println("거짓");
		}
		
		
		// 6
		int num6 = 534;
		int cnt = 0;
		
		System.out.println(num6 / 100);
		System.out.println(num6 % 100);
		System.out.println(cnt++);
		System.out.println(cnt > 0 || num6 < 534);
		System.out.println(cnt <= 0 && num6 > 500);
				
	}

}
