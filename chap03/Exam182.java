package chap03;

import java.util.Scanner;

public class Exam182 {

	public static void main(String[] args) {
		// 2
		int sum = 0;
		for(int i = 1; i < 100; i++) {			
			if(i % 3 == 0) {
				sum += + i;
			}
		}
		System.out.println("3의 배수 총 합 = " + sum);

		// 3
		int count = 0;
		while(true) {
			int fnum = (int)(Math.random() * 6 + 1);
			int snum = (int)(Math.random() * 6 + 1);
			System.out.printf("%d, %d\n",fnum, snum);
			count++;
			if(fnum + snum == 5) {
				System.out.printf("축하합니다. %d번 시도 후 합이 5가 나왔습니다.\n", count);
				break;				
			} 
		}
		
		// 4
		for(int x=0; x <= 10; x++) {
			for(int y=0; y <= 10; y++) {
				if(4*x + 5*y == 60) {
					System.out.printf("x=%d, y=%d\n",x,y);					
				}
			}
			
		}
		
		// 5
		for(int i=0; i < 5; i++) {
			for(int j=0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// 6		
		for(int i=1; i <= 4; i++) {
			for(int j=4; j >= 1; j--) {
				if(j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();		
		}
		
		// 7
		// 잔고가 부족하면 출금이 되지 않도록 할 것.
		// 출금가능액을 출력할 것.
		boolean run = true;
		int balance = 0;
		int money = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(scanner.nextLine());
			
			switch(menu) {
			  case 1: 
			      System.out.print("예금액> ");
			      money = Integer.parseInt(scanner.nextLine());
			      balance += money;
			      break;
			    
			  case 2:
				  System.out.print("출금액> ");	
				  money = Integer.parseInt(scanner.nextLine());
				  if(money > balance) {
					  System.out.println("잔고가 부족합니다.");
					  System.out.printf("출금 가능액은 %d 입니다.\n", balance);
				  } else {					  
					  balance -= money;
				  }
				  break;
				  
			  case 3:
				  System.out.printf("잔고> %d\n",balance);
				  break;
			
			  case 4:
				  run = false;
				  
			      
			}
		}
		System.out.print("프로그램 종료");
	}

}
