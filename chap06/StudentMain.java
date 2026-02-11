package chap06;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		boolean run = true;
		
		Scanner scStud = new Scanner(System.in);
		StudentData studData = new StudentData();
		Student[] studList = null;		
		int num = 0;	
		int studNum = 0;			
	
		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.학생 수 입력 2.학생정보 등록 3.학생정보 조회 4.학생정보 분석 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택 > ");
			num = Integer.parseInt(scStud.nextLine());			
			
			switch(num) {
			case 1:
				System.out.print("학생 수 > ");
				studNum = Integer.parseInt(scStud.nextLine());
				break;
				
			case 2:
				studList = studData.insertInfo(studNum);
				break;
				
			case 3:
				for(int i=0; i<studList.length; i++) {
					System.out.printf("%d 학번 점수 : %d점\n",studList[i].getStudNum(),studList[i].getStudScore());
					
				}
				break;
				
			case 4:
				int maxVal = Integer.MIN_VALUE;
				int minVal = Integer.MAX_VALUE;				
				
				for(int i=0; i<studList.length; i++) {
					if(maxVal < studList[i].getStudScore()) {
						maxVal = studList[i].getStudScore();
					}
					
					if(minVal > studList[i].getStudScore()) {
						minVal = studList[i].getStudScore();
					}							
				}
				double studAvg = (double)(maxVal + minVal)/studList.length;
				
				System.out.println("최고 점수 : " + maxVal);
				System.out.println("최저 점수 : " + minVal);
				System.out.printf("평균 점수는 %.2f점 입니다.\n",studAvg);
				
				break;
				
			case 5:
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		scStud.close();

	}

}
