package chap06;

public class DiceGame {

	public static void main(String[] args) {
		// 주사위 게임
		// 주사위 2개를 던져서 나온 눈의 합으로
		// 컴의 숫자 알아 맞히기(2 ~ 12)
		// 1. 컴의 숫자(난수)
		// 2. 반복문
		  // 주사위 두번 던져서 값을 더하기 
		  // 컴의 숫자 비교
		  // 같으면 탈출
		
		Dice di = new Dice();
		
		boolean run = true;
		
		int com = (int)(Math.random() * 11) + 2;
		System.out.printf("com의 값: %d\n",com);
		
		int num1;
		int num2;
		int count = 0;
		
		while(run) {
			count++;
			num1 = di.getNumber();
			num2 = di.getNumber();
			System.out.printf("num1: %d, num2: %d\n", num1, num2);
			
			if(num1 + num2 == com) {
				run = false;
				System.out.printf("축하합니다. %d회 시도했습니다.", count);
			}
			
		}
		
		
		
	}

}
