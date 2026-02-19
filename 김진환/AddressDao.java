package 김진환;

import java.util.ArrayList;
import java.util.List;

public class AddressDao {
	// 배열 크기 20
	// 친구 20명 저장
	// main으로 전달
	List<Address> list = new ArrayList<>();
	
	AddressDao(){
		list.add(new Address("홍길동", "", "010-1111-1111"));
		list.add(new Address("이말자", "부산광역시 해운대구 센텀로 78", "010-2222-2222"));
		list.add(new Address("주몽왕", "대구광역시 수성구 달구벌대로 90", "010-3333-3333"));
		list.add(new Address("고구려", "인천광역시 연수구 송도과학로 56", "010-4444-4444"));
		list.add(new Address("이성계", "광주광역시 서구 상무대로 210", "010-5555-5555"));
		list.add(new Address("단종님", "대전광역시 유성구 대학로 99", "010-6666-6666"));
		list.add(new Address("홍순기", "울산광역시 남구 삼산로 150", "010-7777-7777"));
		list.add(new Address("홍정봉", "세종특별자치시 한누리대로 300", "010-8888-8888"));
		list.add(new Address("김민수", "경기도 성남시 분당구 판교로 235", "010-1234-5678"));
		list.add(new Address("이서연", "경기도 수원시 영통구 광교중앙로 140", "010-2345-6789"));
		list.add(new Address("박지훈", "경기도 고양시 일산동구 중앙로 1275", "010-3456-7890"));
		list.add(new Address("최은지", "강원특별자치도 춘천시 중앙로 67", "010-4567-8901"));
		list.add(new Address("정우성", "충청북도 청주시 흥덕구 직지대로 400", "010-5678-9012"));
		list.add(new Address("한지민", "충청남도 천안시 서북구 불당대로 180", "010-6789-0123"));
		list.add(new Address("윤태호", "전라북도 전주시 완산구 홍산로 60", "010-7890-1234"));
		list.add(new Address("장다은", "전라남도 여수시 여수대로 250", "010-8901-2345"));
		list.add(new Address("오준혁", "경상북도 포항시 남구 희망대로 110", "010-9012-3456"));
		list.add(new Address("신유진", "경상남도 창원시 성산구 중앙대로 220", "010-1122-3344"));
		list.add(new Address("강동현", "제주특별자치도 제주시 중앙로 15", "010-2233-4455"));
		list.add(new Address("조수빈", "서울특별시 강남구 테헤란로 123", "010-3344-5566"));		
	}
	
	
	// method	
	List<Address> makeAddress() {				
		return list;
	}
	
}
