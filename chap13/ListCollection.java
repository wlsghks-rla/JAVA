package chap13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// 추가
		list.add("java");
		list.add("jdbc");
		list.add("Servlet/jsp");
		list.add(2, "database");
		list.add("ibatis");
		
		// list 크기
		System.out.println(list.size());
		
		// list 출력
		// 일반 for문
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		// list 삭제
		list.remove(1);
		list.remove("ibatis");
		
		
		System.out.println("삭제 후 출력------------");
		// 향상 for문으로 출력
		for(String ele : list) {
			System.out.println(ele);
		}
		
		// 전체 삭제
		list.clear();
		if(list.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("비어있지 않음");
		}
		
		// arrayList, LinkedList 처리 시간 비교
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
		
	}

}
