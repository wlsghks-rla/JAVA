package chap11;

public class ClassClazz {

	public static void main(String[] args) throws ClassNotFoundException {
//		Class<Member> clazz = Member.class;
//		Class<?> clazz = Class.forName("chap11.Member");
		Member member = new Member("홍길동","");
		Class<?> clazz = member.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getSimpleName());

		String p1Pass = clazz.getResource("p1.jpg").getPath(); // bin폴더
		System.out.println(p1Pass);
		
		String p2Pass = clazz.getResource("img/p1.jpg").getPath(); // src폴더
		System.out.println(p2Pass);
	}

}
