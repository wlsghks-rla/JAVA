package chap06;

import java.util.Scanner;

public class StudentData {

	// method
	Student[] insertInfo(int value) {
		Scanner scStud = new Scanner(System.in);
		Student[] studInfo = new Student[value];
		
		
		for(int i=0; i<studInfo.length; i++) {
			String studName = null;
			int studScore = 0;
			int count = 0;
			System.out.println((i+1)+"번째 학생 정보 입력");
			System.out.print("학번 > ");
			int studNum = Integer.parseInt(scStud.nextLine());
			
			for(int j=0; j<studInfo.length; j++) {
				if(studInfo[j] != null) {
					if(studNum == studInfo[j].getStudNum()) {
						System.out.println("중복되었습니다.");
						i -= 1;
						count++;
						break;
					} 					
				}
				
			}			
			if(count == 0) {
				System.out.print("이름 > ");
				studName = scStud.nextLine();
				System.out.print("점수 > ");
				studScore = Integer.parseInt(scStud.nextLine());				
			}
			
			
			studInfo[i] = new Student(studNum, studName, studScore);
		}
		return studInfo;		
	}
		
}
