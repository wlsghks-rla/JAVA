package chap13;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> list = new ArrayList<>();
	
	BoardDao(){
		// list에 데이터 추가(method에 추가해도 됨.) - main method가아니므로 밖에 있으면 실행 불가.
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));		
	}
	
	
	// method
	public List<Board> getBoardList() {
		return list;
	}

}
