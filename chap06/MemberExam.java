package chap06;

public class MemberExam {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.name = "최하얀";
		member.age = 23;
		System.out.println(member.name);
		System.out.println(member.id);

		Member hong = new Member("홍길동", "hong");
		System.out.println(hong.name);
		System.out.println(hong.id);
	}

}
