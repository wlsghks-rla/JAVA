package chap06;

public class BoardExam {

	public static void main(String[] args) {
		Board board1 = new Board();
		
		Board board2 = new Board("제목2", "생성자 오버로딩2");
		System.out.println();
		
		Board board3 = new Board("제목3", "생성자 오버로딩3", "회원아이디3");
		
		Board board4 = new Board("제목4", "생성자 오버로딩4", "회원아이디4", "컴퓨터 날짜4");
		
		Board board5 = new Board("제목5", "생성자 오버로딩5", "회원아이디5", "컴퓨터 날짜5", 5);

	}

}
