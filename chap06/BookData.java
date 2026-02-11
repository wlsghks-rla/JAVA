package chap06;

import java.util.Scanner;

public class BookData {
	// 배열 도서수만큼 생성 -> 배열을 실행클래스로 전달하는 메소드
	// 도서수를 매개변수로 받아서 배열의 크기 결정
	// method 1개
	
	// method
	Book[] getData(int value) {
		Book[] bookList = new Book[value];
		
		Scanner sc1 = new Scanner(System.in);

		for(int i=0; i < bookList.length; i++) {
			System.out.println((i+1)+"번째 도서 정보 입력");
			System.out.print("도서번호 > ");					
			int bookNum = Integer.parseInt(sc1.nextLine());					
			System.out.print("도서제목 > ");
			String title = sc1.nextLine();
			System.out.print("도서가격 > ");
			int money = Integer.parseInt(sc1.nextLine());
			
			bookList[i] = new Book(bookNum, title, money);
		}
		return bookList;
		
	}

}
