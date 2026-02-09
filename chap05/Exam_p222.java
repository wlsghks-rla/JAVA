package chap05;

import java.util.Scanner;

public class Exam_p222 {

	public static void main(String[] args) {
		// 4 p.222
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double avg = 0;
		
		int[] array = {1,5,3,8,2};
		
		for(int num : array ) {
			sum += num;
			
			if(max < num) max = num;
			if(min > num) min = num;
		}
		
		avg = (double)sum / array.length;
		
		System.out.printf("합 = %d, 평균 = %.2f\n최대값 = %d, 최소값 = %d\n", sum, avg, max, min);
		
		// 5 각행의 합과 평균
		int[][] array5 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum5 = 0;
		int avg5 = 0;
		
		
		for(int i=0; i < array5.length; i++) {
			for(int arr : array5[i]) {				
				sum5 += arr;
			}
			System.out.println(i + "번행 합 = " + sum5);
			System.out.printf("%d번행 평균 = %.2f\n", i, (double)sum5 / array5[i].length);
			sum5 = 0;
		}
		
		// 6
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			switch(selectNo){
			  case 1:
				  System.out.print("학생수> ");
				  studentNum = Integer.parseInt(scanner.nextLine());
				  break;
			
			  case 2:
				  scores = new int[studentNum];
				  for(int num=0; num < scores.length; num++) {
				    System.out.printf("scores[%d]> ", num);
				    scores[num] =  Integer.parseInt(scanner.nextLine());
				  }
				  break;
	       
			  case 3:
				  for(int num=0; num < scores.length; num++) {					  
				    System.out.printf("scores[%d]> %d\n", num, scores[num]);	
				  }
				  break;
				  
			  case 4:
				  max = Integer.MIN_VALUE;
				  sum = 0; 
				  for(int num : scores) {
					  sum += num;
					 if(num > max) max = num;					 
				  }
				  System.out.println("최고 점수: "+max);
				  System.out.println("평균 점수: "+(double)sum / scores.length);
				  break;
			  case 5:
				  run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();

	}

}
