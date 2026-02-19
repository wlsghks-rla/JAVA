package chap11;

import java.util.HashMap;

public class ObjectClass {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		Member m1 = new Member("hong","홍길동");
		Member m2 = new Member("hong","홍길동");
		
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1);
		
		HashMap<Key, String> hashmap = new HashMap<>();
		hashmap.put(new Key(1), "홍길동");
		
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		
	}

}
