package 노정화;

import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		//메뉴 : 전체 조회 / 이름 조회 / 전화번호 조회 / ... / 종료
		//배열을 전달 받아서 처리
		Scanner sc = new Scanner(System.in);
		AddressDAO addressdao = new AddressDAO();
		Address[] addressBook = null;
		addressBook = addressdao.getAddress();
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.전체 조회 | 2.이름 조회 | 3.전화번호 조회 | 4.정보 수정 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			  case 1:
			  	for (Address address : addressBook ) {
			  		System.out.printf("이름: %s  전화번호: %s  생일: %s\n", address.getName(), address.getPhone(), address.getBirth());
			  	}
			  	break;
			  	
			  case 2:
			  	System.out.print("이름 > ");
			  	String name = sc.next();
			  	try {
			  		Address data = addressdao.getAddressByName(name);
			  		System.out.printf("이름: %s  전화번호: %s  생일: %s\n", data.getName(), data.getPhone(), data.getBirth());	 			  		
			  	  } catch (NullPointerException e) {
			  		  System.out.println("일치하는 사람이 없습니다.");
			  	}
			  	break;
			  	
			  case 3:
			  	System.out.print("전화번호 > ");
			  	String phone = sc.next();
			  		String data = addressdao.getNameByPhone(phone);			  
			  		if(data == null) {
			  			System.out.println("일치하는 사람이 없습니다.");
			  		} else {
			  			System.out.printf("이름: %s  전화번호: %s\n", data, phone);			  					  			
			  		}
			  	break;
			  	
			  case 4:
			  	System.out.print("수정할 사람의 이름 > ");
			  	String name1 = sc.next();
			  	boolean run2 = true;
			  	while(run2) {
			  		System.out.println("=================================");
			  		System.out.println("1.이름 수정 | 2.전화번호 수정 | 3.종료");
			  		System.out.println("=================================");
			  		System.out.print("선택 > ");
						int selectNo2 = sc.nextInt();
						
						switch(selectNo2) {
						  case 1:
						  	System.out.print("새 이름 > ");
						  	String name2 = sc.next();
						  	addressdao.modifyName(name1, name2);
						  	name1 = name2;
					  	break;						  	
						  	
						  case 2:
						  	System.out.print("새 전화번호 > ");
						  	String phone2 = sc.next();
						  	addressdao.modifyPhone(name1, phone2);						 
					  	break;	
						  	
						  case 3:
						  	run2 = false;
						  	break;
						}
			  	}
			  	break;
			  	
			  case 5:
			  	run = false;
			  	break;
			}
		}//end while
		System.out.println("프로그램 종료");
		
		sc.close();

	}//end main

}
