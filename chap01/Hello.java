package chap01;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello Java~"); // ln: 줄바꿈
		
		// data type
		char char1 = 'A';
		int intA = 'A';
		char str1 = 'a';
		String str = "a"; // ""는 문자열로 인식(기본타입이 아님) -> 클래스타입이다.(메모리에 주소가 저장됨)
		System.out.println(char1);
		System.out.println(intA);
		System.out.println(str);
		System.out.println(str1);
		
		// 확인문제9(p.110)
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result =  (int)(var1 + var2 + var3) + (int)Double.parseDouble(var4);
		
		System.out.printf("결과 = %d\n",result);
		
		// p.113
		System.out.printf("var1 = %d\tvar2 = %.2f \nvar3 = %.2f\tvar4 = %s\n",var1, var2, var3, var4);
		System.out.println("end");
		
		// System.in.read
		System.out.println("키 입력>> ");
		
		// 기본 타입 값 비교 ==
		// class 타입 값 비교 equals()
		String str2 = "java"; // str2,3은 힙영역에 있는 'java' 같은 주소 사용
		String str3 = "java";
		String str4 = new String("java"); // 위의 str2,3과는 다른 영역
		String str5 = new String("java");
		
		System.out.println(str5 == str4); // 문자열은 == 사용시 주소 비교
		System.out.println(str5.equals(str4)); // .equals() 값을 비교
		
		
		

	}// end main

}// end class

