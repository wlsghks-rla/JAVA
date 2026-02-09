package chap04;

import java.util.Scanner;

public class Mission {

	public static void main(String[] args) {
//		// 1. 윤년 계산
//		Scanner sc1 = new Scanner(System.in);
//		int year = 0;
//		
//		System.out.print("##년도 입력 : ");
//		year = Integer.parseInt(sc1.nextLine());
//		
//		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println("윤년입니다.");
//		} else {
//			System.out.println("평년입니다.");
//		}
//		sc1.close();
//		
//		// 2. 동전 계산
//		Scanner sc2 = new Scanner(System.in);
//		int money = 0;
//		int inmoney = 0;
//		int coin = 0;		
//		
//		System.out.print("##교환할 금액 : ");
//		money = Integer.parseInt(sc1.nextLine());
//		
//		coin = money / 500;
//		inmoney = money - coin * 500;
//		System.out.println("500원 짜리 : " + coin);
//		
//		coin = inmoney / 100;
//		inmoney -= coin * 100;
//		System.out.println("100원 짜리 : " + coin);
//		
//		coin = inmoney / 50;
//		inmoney -= coin * 50;
//		System.out.println("50원 짜리 : " + coin);
//		
//		coin = inmoney / 10;
//		inmoney -= coin * 10;
//		System.out.println("10원 짜리 : " + coin);
//		
//		System.out.println("교환 금액 : " + (money - inmoney));
//		System.out.println("남은 금액 : " + inmoney);
//		sc2.close();
		
		// 4. 구구단
//		for(int i=2; i <= 9; i++) {
//			System.out.printf("%3ddan ", i);			
//		}
//		System.out.println();
//		
//		for(int i=1; i <= 9; i++) {
//			for(int j=2; j <= 9; j++) {
//			System.out.printf("%dx%d=%2d ",j,i,j*i);
//			}
//			System.out.println();
//		}
//		
//		// 5. 섭씨-화씨 온도 변환
//		Scanner sc5 = new Scanner(System.in);
//		boolean run5 = true;
//		int num = 0;
//		int temp = 0;
//		
//		while(run5) {			
//			System.out.println("-----------------------");
//			System.out.println("1. 화씨 => 섭씨");
//			System.out.println("1. 섭씨 => 화씨");
//			System.out.println("3. 종료");
//			System.out.println("-----------------------");
//			System.out.print("번호 선택 : ");
//			num = Integer.parseInt(sc5.nextLine());
//						
//			switch(num) {
//			  case 1:
//				  System.out.print("화씨온도 입력 : ");
//				  temp = Integer.parseInt(sc5.nextLine());
//				  System.out.printf("섭씨온도 = %f\n", (double)5/9*(temp-32));
//				  break;
//			  
//			  case 2:
//				  System.out.print("섭씨온도 입력 : ");
//				  temp = Integer.parseInt(sc5.nextLine());
//				  System.out.printf("화씨온도 = %f\n", (double)9/5*temp+32);
//				  break;
//				  
//			  case 3:
//				  run5 = false;
//			}
//			
//		}
//		System.out.println("program end");
//		sc5.close();
		
		// 6. 가위바위보 게임
		Scanner sc6 = new Scanner(System.in);
		int rock = 0;
		int com = 0;
		boolean run6 = true;
		
		while(run6) {
			com = (int)(Math.random() * 3);
			System.out.print("## 가위(0) 바위(1) 보(2) : ");
			rock = Integer.parseInt(sc6.nextLine());
			if(rock > 2) {
		System.out.println("game over");
		break;
		}
		
		if(com == rock) {
			System.out.printf("com = %d, vs my = %d : 비겼음\n", com, rock);
		} else if(com == (rock + 1) % 3) {
			System.out.printf("com = %d, vs my = %d : com 승리\n", com, rock);
		} else {
			System.out.printf("com = %d, vs my = %d : my 승리\n", com, rock);
		}
	}
		
		sc6.close();
		
		// 7
		for(int i=1; i <= 50; i++) {
			int count = 0;
			int value1 = i % 10;
			int value10 = i / 10;
			if(value1  == 3 || value1  == 6 || value1  == 9) {				
				count ++;
			}
			
			if(value10 == 3 || value10 == 6 || value10 == 9) {
				count ++;
			}
			
			switch(count) {
			case 0: 
				System.out.printf("%-2d ", i);
				break;
			case 1:
				System.out.printf("%-2s ", "♥");
				break;
			case 2:
				System.out.printf("%-2s ", "♥♥");
				break;
			}
//			
			if(i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
