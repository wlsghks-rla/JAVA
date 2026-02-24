package 김진환1;

public class Address {
	// 친구 객체를 만드는 클래스
	// 이름, 주소, 전화번호, 생일
	
	// field
	private String name;
	private String home;
	private String number;
	
	// constructor
	Address(String name, String home, String number) {
		this.name = name;
		this.home = home;
		this.number = number;
	}
	
	// method
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setAddress(String address) {
		// TODO Auto-generated method stub
		
	}
	
}
