package 노정화;

public class AddressDAO {
	//배열 크기 : 20
	//친구 20명 저장
	//Main으로 전달
	//필드
	Address[] addressBook = {
	    new Address("김민수", "010-1234-1001", "1995-03-12"),
	    new Address("이서연", "010-1234-1002", "1994-07-21"),
	    new Address("박지훈", "010-1234-1003", "1996-11-05"),
	    new Address("최유진", "010-1234-1004", "1993-01-30"),
	    new Address("정현우", "010-1234-1005", "1997-09-14"),
	    new Address("강다은", "010-1234-1006", "1998-04-18"),
	    new Address("홍준서", "010-1234-1007", "1992-12-02"),
	    new Address("윤아름", "010-1234-1008", "1995-06-25"),
	    new Address("한지호", "010-1234-1009", "1994-08-09"),
	    new Address("홍준서", "010-1234-1010", "1996-02-17"),
	    new Address("서준영", "010-1234-1011", "1993-10-11"),
	    new Address("신가은", "010-1234-1012", "1997-05-29"),
	    new Address("임도윤", "010-1234-1013", "1998-01-07"),
	    new Address("황수빈", "010-1234-1014", "1995-12-19"),
	    new Address("문태양", "010-1234-1015", "1992-03-23"),
	    new Address("장예린", "010-1234-1016", "1996-07-03"),
	    new Address("백승현", "010-1234-1017", "1994-09-27"),
	    new Address("노지민", "010-1234-1018", "1993-11-15"),
	    new Address("송하린", "010-1234-1019", "1997-04-06"),
	    new Address("홍준서", "010-1234-1020", "1998-08-22")
	};

	//메서드(필드를 바로 리턴)
	Address[] getAddress() {
		return addressBook;
	}
	
	//이름은 중복이 있을 수 있다는 가정으로 배열로 받아서 넘겨서 배열 순회해서 프린트 해볼것
//	Address[] getAddressByName(String name) {
//		Address[] datas = new Address[5];
//		int count = 0;
//		for (int i=0; i<addressBook.length; i++) {
//			if(addressBook[i].getName().equals(name)) {				
//				datas[count] = addressBook[i];
//				count++;
//			}
//		}
//		return datas;
//	}
	
  //이름 중복 없음^^!
	Address getAddressByName(String name) {
		for (int i=0; i<addressBook.length; i++) {
			if(addressBook[i].getName().equals(name)) {				
				return addressBook[i];
			}
		}
		return null;
	}
	
	// 전화번호로 이름 조회
	String getNameByPhone(String phone) {
		for (int i=0; i<addressBook.length; i++) {
			if(addressBook[i].getPhone().equals(phone)) {
				return addressBook[i].getName();
			}
		}
		return null;
	}
	
	// 이름 수정
	void modifyName(String name, String name2) {
		for (int i=0; i<addressBook.length; i++) {
			if(addressBook[i].getName().equals(name)) {
				addressBook[i].setName(name2);								
			}
		}
	}
	
	// 전화번호 수정
	void modifyPhone(String name, String phone2) {
		for (int i=0; i<addressBook.length; i++) {
			if(addressBook[i].getName().equals(name)) {
				addressBook[i].setPhone(phone2);								
			}
		}
	}
	

}
