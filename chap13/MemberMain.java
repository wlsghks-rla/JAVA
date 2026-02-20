package chap13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberMain {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		// 객체 5개 추가
		set.add(new Member("홍길동", 30));
		set.add(new Member("주몽", 50));
		set.add(new Member("온조", 40));
		set.add(new Member("이성계", 20));
		set.add(new Member("고몽", 10));
		
		// 전체 출력
		System.out.println("전체출력 ---");
		for(Member mem : set) {
			System.out.println(mem);
		}
		
		// 객체 1개 삭제 후 출력
		Iterator<Member> ir = set.iterator();
		while(ir.hasNext()) {
			Member str = ir.next();
			
			if((str.name).equals("주몽")) {
				ir.remove();
			}
		}
		
		System.out.println("1개 삭제후 출력 ---");
		
		for(Member mem : set) {
			System.out.println(mem);
		}
	}

}
