package chap13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		// map 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 데이터 추가
		map.put("홍길동", 90);
		map.put("성춘향", 100);
		map.put("홍길동", 99);
		map.put("이몽룡", 80);
		
		// keySet 출력
		Set<String> keySet = map.keySet();
		
		Iterator<String> ir = keySet.iterator();
		while(ir.hasNext()) {
			String key = ir.next();
			Integer value = map.get(key);
			System.out.printf("%s : %d\n", key, value);
		}
		
		System.out.println("향상된 for문---");
		for(String key : keySet) {
			System.out.printf("%s : %d\n", key, map.get(key));
		}
		
		// 삭제
		map.remove("홍길동");
		
		// entrySet 출력
		System.out.println("삭제 후 출력---");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> ir2 = entrySet.iterator();
		
		while(ir2.hasNext()) {
			Map.Entry<String, Integer> entry = ir2.next();
			String key = entry.getKey();
			Integer value = entry.getValue();			
			System.out.printf("%s : %d\n", key, value);
		}
		
		System.out.println("향상된 for문---");
		for(Map.Entry<String, Integer> entry : entrySet) {
			System.out.printf("%s : %d\n",  entry.getKey(), entry.getValue());
		}
		
		// 크기
		System.out.println(map.size());
		
		// 전체 삭제
		map.clear();
		
		if(map.isEmpty()) {
			System.out.println("배열이 비었음");
		}
	}

}
