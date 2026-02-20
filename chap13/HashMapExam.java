package chap13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		// HashMap 생성
		Map<Student, Integer> map = new HashMap<>();
		
		// 데이터 추가.
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "홍길순"), 93);
		map.put(new Student(3, "고몽"), 80);
		map.put(new Student(4, "어몽스"), 70);
		map.put(new Student(5, "홍빵빵"), 88);
		map.put(new Student(6, "홍옥지"), 99);
		
		// keyset 출력
		System.out.println("keyset ----");
		Set<Student> keySet = map.keySet();
		Iterator<Student> ir = keySet.iterator();
		
		while(ir.hasNext()) {
			Student student = ir.next();
			Integer value = map.get(student);
			
			System.out.println(student + " : " + value);
		}
		
		// entryset 출력
		System.out.println("entryset ----");
		Set<Map.Entry<Student, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<Student, Integer>> ir2 = entrySet.iterator();
		
		while(ir2.hasNext()) {
			Map.Entry<Student, Integer> entry = ir2.next();
			Student key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
		
		// 입력된 key값 같은 데이터 삭제
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제 후 출력");
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("학번 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		Student input = new Student(num, name);
		
//		map.remove(new Student(2, "홍길순"));
		
		ir = keySet.iterator();		
		while(ir.hasNext()) {
			Student key = ir.next();
			if(key.equals(input)) {
				ir.remove();
			} else {
				System.out.println("회원이 없습니다.");
			}
		}
		
		
		// 향상 for문 출력
		for(Student key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}

	}

}
