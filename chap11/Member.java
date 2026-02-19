package chap11;

public class Member {
	// field
	public String id;
	public String name;
	
	// constructor
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}	
	
	// method
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(member.id.equals(id)) {
				return true;
			}
		} 
		return false;
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
}
