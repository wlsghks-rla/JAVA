package chap06;

public class SingletonExam {

	public static void main(String[] args) {
		// 객체 생성
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		
		System.out.println(st1);
		System.out.println(st2);

	}

}
