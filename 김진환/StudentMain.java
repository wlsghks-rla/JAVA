package 김진환;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		StudentData stud = new StudentData();
		List<Student> list = new ArrayList<>();
		
		int num = 0;
		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.학생수 입력 2.학생정보 등록 3.학생정보 전체조회 4.학생정보 분석 5.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택 > ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				System.out.print("학생 수 > ");
				num = Integer.parseInt(sc.nextLine());
				break;
				
			case 2:
				list = stud.insertStudent(num);
				break;
				
			case 3:
				for(Student info : list) {
					System.out.println(info);
				}
				break;
				
			case 4:
				int min = Integer.MAX_VALUE;
				int max = Integer.MIN_VALUE;
				int sum = 0;
				
				for(Student info : list) {
					if(info.getStudentResult() > max) {
						max = info.getStudentResult();
					}
					
					if(info.getStudentResult() < min) {
						min = info.getStudentResult();
					}
					
					sum += info.getStudentResult();
				}
				
				double avg = (double)sum / list.size();
				
				System.out.println("최고 점수 : " + max + "점");
				System.out.println("최저 점수 : " + min + "점");
				System.out.printf("평균 점수는 %.2f점 입니다.\n", avg);								
				break;
				
			case 5:
				run = false;
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
		sc.close();

	}

}
