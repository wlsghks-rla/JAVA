package chap03;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// 확인문제 1 ~ 14 p.149
		// 1
		// 2번 줄
		
		// 2
		// 31
		
		// 3
//		boolean stop = true;
//		while(!stop) {};
//		
//		// 4
//		int pencils = 534;
//		int students = 30;
//		
//		int pencilsPerStudent = pencils / students;
//		System.out.println(pencilsPerStudent);
//		
//		int pencilsLeft = pencils % students;
//		System.out.println(pencilsLeft);
//		
//		// 5
//		int var1 = 5;
//		int var2 = 2;
//		double var3 = (double)var1 / var2;
//		int var4 = (int)(var3 * var2);
//		System.out.println(var4);
//		
//		// 6
//		int value = 356;
//		System.out.println(value - (value % 300));
		
//		// 7
//		float var1 = 10f;
//		float var2 = var1 / 100;		
//		if(var2 == (float)0.1) {
//			System.out.println("10%입니다.");
//		} else {
//			System.out.println("10%가 아닙니다.");
//		}
//		
//		// 8
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
//		double area = ((lengthTop + lengthBottom) * height) * 0.5;
		double area = ((lengthTop + lengthBottom) * height) / 2.0;
		System.out.println(area);
		
//		// 9
//		Scanner sc1 = new Scanner(System.in);
//		System.out.print("첫 번째 수: ");
//		String fnum1 = sc1.nextLine();
//		
//		System.out.print("두 번째 수: ");
//		String fnum2 = sc1.nextLine();
//		
//		double result = Double.parseDouble(fnum1) / Double.parseDouble(fnum2);
//		if(fnum2.equals("0") || fnum2.equals("0.0")) {
//			System.out.println("결과: " + "무한대");
//		} else {			
//			System.out.println("결과: " + result);
//		}
		
		// 10
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		
		System.out.println("원의 넓이: " + var4);
		
		// 11
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scanner.nextLine();
			
		System.out.print("패스워드: ");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
		}
		
		// 12
		int x = 10;
		int y = 5;
		System.out.println((x>7) && (y<=5));
		System.out.println((x%3 == 2) || (y%2 != 1));
		
		// 13
		int value = 0;
		
		value += 10;
		value -= 10;
		value *= 10;
		value /= 10;
		
		System.out.println(value);
		
		// 14
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println(result);

		
		// if 문제
		int num = (int)(Math.random() * 100 + 1);
		System.out.println(num);
		Scanner sc4 = new Scanner(System.in);
		int numbering = 0;
		int i = 0;
		
		
		while(true) {			
			System.out.print("숫자를 입력>>");
			numbering = sc4.nextInt();
			i++;
			if(numbering < num) {
				System.out.println("up하세요!!!");
			} else if(numbering > num){
				System.out.println("down하세요!!!");			
			}
			
			if(numbering == num) {
				System.out.println("축하합니다.");
				System.out.printf("총 %d회 시도했습니다.", i);
				break;
			}
			
			
		}
	}

}
