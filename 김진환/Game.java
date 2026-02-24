package 김진환;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// 문제7
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random() * 50 + 1);
		
		while(run) {
			System.out.print("숫자 입력 : ");
			int result = Integer.parseInt(sc.nextLine());
			
			if(result == num) {
				System.out.println("축하합니다!!");
				break;
			} else if(result < num) {
				System.out.println("up하세요!!");
			} else if(result > num) {
				System.out.println("down하세요!!");
			}
		}
		
		sc.close();

	}

}
