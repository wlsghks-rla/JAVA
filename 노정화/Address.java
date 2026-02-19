package 노정화;

public class Address {
	//친구 객체를 만드는 클래스
	//이름, 주소, 전화번호, 생일...
	//필드
	private String name;
	private String phone;
	private String birth;
	
	//생성자
	public Address() {}
	
	public Address(String name, String phone, String birth) {
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}
	
	
	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}


	

}
