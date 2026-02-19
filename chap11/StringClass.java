package chap11;

import java.io.IOException;

public class StringClass {

	public static void main(String[] args) throws IOException {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		byte[] bytes2 = { 108, 111, 118, 101 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		
		String str3 = new String(bytes2);
		System.out.println(str3);
		
		/*
		byte[] inputs = new byte[100];
		System.out.print("입력 >> ");
		int byteNo = System.in.read(inputs);
		
		String str4 = new String(inputs, 0, byteNo-2);
		System.out.println(str4);
		*/
		
		String str = "안녕하세요";
		byte[] bytes5 = str.getBytes();
		System.out.println("bytes5.length: " + bytes5.length);
		String str5 = new String(bytes5);
		System.out.println("bytes5->String: " + str5);
		
		
		byte[] bytes6 = str.getBytes("EUC-KR");
		String str6 = new String(bytes6);
		System.out.println("bytes6.length: " + bytes6.length);
		String strEuc = new String(bytes6, "EUC-KR");
		System.out.println("bytes6->String: " + strEuc);
		
		byte[] bytes7 = str.getBytes("MS949");
		String str7 = new String(bytes7);
		System.out.println("bytes7.length: " + bytes7.length);
		String strMS = new String(bytes7, "MS949");
		System.out.println("bytes7->String: " + strMS);
		
		// 문자 대체 -> 새로운 문자열 생성
		String newStr1 = str1.replace("Java", "자바");
		System.out.println(newStr1);
		
		// 주민번호 성별 이후에 있는 번호 * 6개로 변경
		String ssn = "880815-1234567";
		
		String newSsn = ssn.replace(ssn.substring(8), "******");		
		
		System.out.println(newSsn);
	}

}
