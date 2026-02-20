package chap13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.processing.SupportedSourceVersion;

public class SetName {

	public static void main(String[] args) {
		// set 생성
		Set<String> set = new HashSet<>();
		
		// 추가
		set.add("java");
		set.add("jdbc");
		set.add("servlet/jsp");
		set.add("java"); // 동등객체 저장 안됨
		set.add("ibatis");
		
		System.out.println(set.size()); // 크기 출력
		
		// 반복자 이용 출력
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			String obj = ir.next();
			System.out.println(obj);
		}
		
		// 삭제
		set.remove("ibatis");
		System.out.println(set.size());
		
		// 향상 for문 이용 출력
		for(String obj : set) {
			System.out.println(obj);
		}
		
		// jdbc 삭제
		ir = set.iterator(); // 앞에 있으므로 재선언x
		while(ir.hasNext()) {
			String str = ir.next();
			if(str.equals("jdbc")) {
				ir.remove();
			}
		}
		
		System.out.println("-----------------------");
		for(String str : set) {
			System.out.println(str);
		}
		
		// 전체 삭제
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("비어있지 않음");
		}

	}

}
