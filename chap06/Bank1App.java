package chap06;

import java.util.Scanner;

public class Bank1App {

	public static void main(String[] args) {
		// 길이가 100인 배열 생성
		Bank1[] bankList = new Bank1[100];
		int menu; // 결과 번호
		boolean run = true;
		Scanner sc1 = new Scanner(System.in);
		Bank1 banking = new Bank1();
		boolean nonList = true;
		
		while(run) {			
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택>");
			menu = Integer.parseInt(sc1.nextLine());
			
			switch(menu) {
			case 1:
				System.out.println("-----------");
				System.out.println("계좌생성");
				System.out.println("-----------");
				System.out.print("계좌번호: ");
				String ano = sc1.nextLine();
				System.out.print("계좌주: ");
				String owner = sc1.nextLine();
				System.out.print("초기입금액: ");
				int balance = Integer.parseInt(sc1.nextLine());
				
				// 초기입금액 범위
				boolean result1 = banking.firstIn(balance);
				if(result1) {				
					System.out.println("결과: 계좌가 생성되었습니다.");
					for(int i=0; i<bankList.length; i++) {
						
						if(bankList[i] == null) {
							bankList[i] = new Bank1(ano, owner, balance);
							break;
						}					
					}				
				} else {
					System.out.println("계좌 생성이 불가합니다.");
				}
				break;
				
			case 2:
				System.out.println("-----------");
				System.out.println("계좌목록");
				System.out.println("-----------");
				for(int i=0; i<bankList.length; i++) {					
					if(bankList[i] != null) {
						System.out.printf("%s, %s, %s\n",bankList[i].getAno(), bankList[i].getOwner(), String.valueOf(bankList[i].getBalance()));
					}					
				}
				break;
			 case 3:				 
				 System.out.println("-----------");
				 System.out.println("예금");
				 System.out.println("-----------");
				 System.out.print("계좌번호: ");
				 ano = sc1.nextLine();
				 for(int i=0; i<bankList.length; i++) {
					 if(bankList[i] != null) {
						 if((bankList[i].getAno()).equals(ano)) {
							 System.out.print("예금액: ");
							 balance = Integer.parseInt(sc1.nextLine());
							 bankList[i].setBalance(bankList[i].moneyIn(balance));
							 System.out.println("예금이 성공되었습니다.");
							 nonList = false;
							 break;
						 }									 
					 }
				 }		
				 
				 if(nonList) {
					 System.out.println("계좌가 없습니다. 생성해주세요.");
				 }
				break;
				
			   case 4:
				   System.out.println("-----------");
					 System.out.println("출금");
					 System.out.println("-----------");
					 System.out.print("계좌번호: ");
					 ano = sc1.nextLine();
					 for(int i=0; i<bankList.length; i++) {
						 if(bankList[i] != null) {
							 if((bankList[i].getAno()).equals(ano)) {
								 nonList = false;
								 System.out.print("출금액: ");
								 balance = Integer.parseInt(sc1.nextLine());
								 if(bankList[i].getBalance() >= balance) {
									 bankList[i].setBalance(bankList[i].moneyIn(-balance));
									 System.out.println("출금이 성공되었습니다.");														 
								 } else {
									 System.out.println("출금이 불가능합니다.");										 			
								 }
								 break;
							 }									 
						 }
					 }		
					 
					 if(nonList) {
						 System.out.println("계좌가 없습니다. 생성해주세요.");
					 }
					
					 break;
					 
			       case 5:
			         System.out.println("프로그램 종료");
			         run = false;
					
			}
		}
		
		
		
		

	}

}
