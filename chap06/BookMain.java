package chap06;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// 메뉴를 만들어서 처리하는 작업
		BookData data = new BookData();
		Scanner sc1 = new Scanner(System.in);
		boolean run = true;
		int menu;
		Book[] bookList = null;
		int num = 0;
		int maxVal = Integer.MIN_VALUE;
		int minVal = Integer.MAX_VALUE;
		
		
		
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.도서 수 입력 2.도서정보 등록 3.도서정보 전체조회 4.도서정보 분석 5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택 > ");
			menu = Integer.parseInt(sc1.nextLine());
			
			switch(menu) {
			case 1: 
				System.out.print("도서 수 > ");
				num = Integer.parseInt(sc1.nextLine());
				break;
				
			case 2:
				bookList = data.getData(num);				
				break;
				
			case 3:
				 for(int i=0; i < bookList.length; i++) {						
						System.out.printf("도서번호 : %d 가격 : %d원\n", bookList[i].getBookNum(), bookList[i].getMoney());				
					}
				  break;
				
			 case 4:
				 int sum = 0;
				 for(int i=0; i < bookList.length; i++) {
					 if(bookList[i].getMoney() > maxVal) {
						 maxVal = bookList[i].getMoney();
					 }
					 
					 if(bookList[i].getMoney() < minVal) {
						 minVal = bookList[i].getMoney();
					 }
					 sum += bookList[i].getMoney();
					}
				 double avg = (double)sum / bookList.length;
				 System.out.printf("최고가격 : %d원\n", maxVal);						
				 System.out.printf("최저가격 : %d원\n", minVal);							
				 System.out.printf("평균가격은 %.1f원 입니다.\n", avg);						
				  break;
				  
			 case 5:
				 run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		sc1.close();

	}

}
