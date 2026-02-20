package 김진환;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		// 메뉴 : 전체 조회/ 이름 조회/ 전화번호 조회 / 수정 / ... / 종료
		// 배열을 전달 받아서 처리
		
		Scanner sc = new Scanner(System.in);
		boolean run = true; 
		int menu = 0; // 메뉴번호
		List<Address> friends =  new ArrayList<>();
		AddressDao dao = new AddressDao();
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.전체 조회 2.이름 조회 3.전화번호 조회 4.수정 5.추가 등록 6.삭제 7.프로그램 종료");
			System.out.println("---------------------------------------------------");		
			System.out.print("선택 > ");
			friends = dao.makeAddress();
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: 
				System.out.println("----------");
				System.out.println("1.전체 조회");
				System.out.println("----------");
				
				
				for(int i=0; i<friends.size(); i++) {					
					System.out.printf("%-4s\t%-20s\t%s\n", friends.get(i).getName(), friends.get(i).getHome(), friends.get(i).getNumber());
				}				
				
				break;
				
			case 2:				
					System.out.println("----------");
					System.out.println("2.이름 조회");
					System.out.println("----------");
					System.out.print("이름 입력 : ");
					String name = sc.nextLine();
					int idx = 0;
					
					for(int i=0; i<friends.size(); i++) {
						if((friends.get(i).getName()).equals(name)) {
							System.out.printf("%-4s\t%-20s\t%s\n", friends.get(i).getName(), friends.get(i).getHome(), friends.get(i).getNumber());
							idx++;
							break;
						}
					}
					
					if(idx == 0) {
						System.out.println("정보가 없습니다.");
					}					
				
				
				break;
				
			case 3:								
					System.out.println("----------");
					System.out.println("3.전화번호 조회");
					System.out.println("----------");
					System.out.print("전화번호 입력 : ");
					String number = sc.nextLine();
					
					for(int i=0; i<friends.size(); i++) {
						if((friends.get(i).getNumber()).equals(number)) {
							System.out.printf("%-4s\t%-20s\t%s\n", friends.get(i).getName(), friends.get(i).getHome(), friends.get(i).getNumber());
							break;
						}
					}
				
				break;		
			
				
			case 4:						
					System.out.println("----------");
					System.out.println("4.수정");
					System.out.println("----------");
					System.out.print("이름 입력 : ");
					String searchName = sc.nextLine();
					int count = 0;
					for(int i=0; i<friends.size(); i++) {
						if((friends.get(i).getName()).equals(searchName)) {
							count++;
							String infoName = friends.get(i).getName();
							String infoAddress = friends.get(i).getHome();
							String infoNumber = friends.get(i).getNumber();
							System.out.println("----------");
							System.out.print("수정항목 선택(1.이름 2.전화번호 3.주소) > ");
							int num = Integer.parseInt(sc.nextLine());			 
							
							switch(num) {
							case 1:
								System.out.println("----------");
								System.out.print("새이름 입력 : ");
								String selectedName = sc.nextLine();
								
								dao.list.get(i).setName(selectedName);
								System.out.printf("이름을 %s에서 %s으로 수정완료\n", infoName, selectedName);
								break;
								
							case 2:					 
								System.out.println("----------");
								System.out.print("새 전화번호 입력 : ");
								String phone = sc.nextLine();
								
								dao.list.get(i).setNumber(phone);
								System.out.printf("번호를 %s에서 %s로 수정완료\n", infoNumber, phone);
								break;
								
							case 3:					 
								System.out.println("----------");
								System.out.print("새 주소 입력 : ");
								String address = sc.nextLine();
								
								dao.list.get(i).setAddress(address);
								System.out.printf("주소를 %s에서 %s으로 수정완료\n", infoAddress, address);
								break;
							}
							break;
						}
						
					}		
					if(count == 0) {						
						System.out.println("정보가 없습니다.");
						break;
					}
				break;
				
			case 5: 				
				System.out.println("----------");
				System.out.println("5.추가 등록");
				System.out.println("----------");
				System.out.print("이름을 입력해주세요");
				String newName = sc.nextLine();
				System.out.print("주소를 입력해주세요");
				String newAddress = sc.nextLine();
				System.out.print("번호를 입력해주세요");
				String newNumber = sc.nextLine();
				dao.insertAddress(newName, newAddress, newNumber);				
				break;
				
			case 6: 
//				List<Address> duplicateFri =  new ArrayList<>();; // 동명이인일 경우
				System.out.println("----------");
				System.out.println("6.삭제");
				System.out.println("----------");
				System.out.print("이름을 입력해주세요");
				String delName = sc.nextLine();
				dao.delAddress(delName);				
				break;
				
			case 7:
				run = false;
				
			}
		}
		System.out.println("프로그램 종료");
		
		
	}

}
