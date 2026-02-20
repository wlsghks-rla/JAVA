package chap13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
				
		for(Map.Entry<String, Integer> entry : entrySet) {
			if(maxScore < entry.getValue()) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			
			totalScore += entry.getValue();
		}
		
		System.out.println("평균점수: " + totalScore/map.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);

	}

}
