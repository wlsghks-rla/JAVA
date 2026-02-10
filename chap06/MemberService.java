package chap06;

public class MemberService {
	// field
	
	// constructor
	
	// method
	boolean login(String id, String password) {		
		if(id.equals("hong") && password.equals("12345")) {
			return true;			
		} else {
			return false;
		}		
	}
	
	void logout(String id) {
		System.out.println(id+"가 로그아웃 되었습니다.");
	}
	

}
