package 김진환;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentData {
	List<Student> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public List<Student> insertStudent(int num) {
		for(int i=1; i<=num; i++) {
			System.out.printf("%d 번째 학생 정보 입력\n",i);
			System.out.printf("학번 > ");
			int studNum = Integer.parseInt(sc.nextLine());
			System.out.printf("이름 > ");
			String studName = sc.nextLine();
			System.out.printf("점수 > ");
			int studResult = Integer.parseInt(sc.nextLine());
			
			list.add(new Student(studNum, studName, studResult));
		}
		
		return list;
	}
	
	
}
