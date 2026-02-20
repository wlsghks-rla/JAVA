package chap13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentExam {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(1, "강호동"));
		set.add(new Student(2, "주몽"));
		set.add(new Student(3, "온조"));
		set.add(new Student(4, "고조선"));
		set.add(new Student(5, "이성계"));
		set.add(new Student(6, "장영실"));
		
		Iterator<Student> ir = set.iterator();
		
		while(ir.hasNext()) {
			Student student = ir.next();
			System.out.println(student);
		}
		
		// 삭제
		ir = set.iterator();
		
		while(ir.hasNext()) {
			Student student = ir.next();
			if(student.studentNum == 3) {
				ir.remove();
			}
		}
		
		System.out.println("삭제 후 출력 ----");
		
		for(Student stud : set) {
			System.out.println(stud);
		}

	}

}
