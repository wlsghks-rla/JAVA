package chap13;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> list = new ArrayList<>();
	
	BoardDao(){
		// list에 데이터 추가(method에 추가해도 됨.) - main method가아니므로 밖에 있으면 실행 불가.
		// list data 추가 10개, 글쓴이 추가		
		list.add(new Board("오늘 점심 역대급 급식 메뉴 인증", "돈가스 산처럼 쌓아주고 제육볶음까지 무한리필로 주는 우리 회사 식당 클라스", "급식매니아"));
		list.add(new Board("10년 만에 찾은 첫사랑 결혼 소식", "우연히 건너건너 들었는데 행복하게 잘 산다는 말에 마음이 묘해지는 밤입니다", "새벽감성"));
		list.add(new Board("당근마켓 무료 나눔 하다가 인류애 상실함", "공짜로 주는데 집 앞까지 배달해달라며 화내는 사람 때문에 결국 차단했습니다", "매너온도하락"));		
		list.add(new Board("우리 집 고양이가 천재인 이유", "자기가 사고 치고 나서 슬픈 표정 지으면 집사가 안 혼내는 걸 이미 알고 있음", "냥집사1호"));		
		list.add(new Board("부장님 단톡방 실수 레전드", "부장님 뒷담화를 부장님 계신 단톡방에 올리고 1이 안 사라지길 기도하는 중", "퇴사고민"));		
		list.add(new Board("편의점 야간 알바 중 만난 빌런", "검정 봉투에 돈 대신 돌멩이 담아와서 담배랑 바꿔달라고 우기던 사람 목격담", "편돌이24시"));		
		list.add(new Board("층간소음 복수하려다 포기한 이유", "윗집 올라갔더니 꼬마 애가 미안하다며 사탕 주는데 화가 사르르 녹아버림", "평화주의자"));		
		list.add(new Board("주식 수익률 -90% 인증합니다", "남들 다 벌 때 혼자 상장폐지 직전까지 간 눈물의 계좌 보고 다들 힘내세요", "한강물체크"));		
		list.add(new Board("길고양이 간택 당한 후기", "비 오는 날 퇴근길에 계속 따라오길래 결국 집까지 들였는데 벌써 상전임", "간택받은집사"));		
		list.add(new Board("대학교 에브리타임 핫게시물", "시험기간 도서관에서 코 고는 사람 포스트잇으로 경고했더니 쪽지로 싸움 난 현장", "프로불편러"));		
	}
	
	
	// method
	// 전체 조회
	public List<Board> getBoardList() {
		return list;
	}
	
	// 추가
	public boolean insertBoardList(String title, String content, String writer) {
		list.add(new Board(title, content, writer));
		
		return true;
	}
	
	// 조회
	public void searchBoardList(String writer) {
		List<Board> searchInfo = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWriter().equals(writer)) {
				System.out.printf("%d. %s | %s | %s\n", i+1, list.get(i).getTitle(), list.get(i).getContent(),list.get(i).getWriter());
			}
		}
	}
	
	// 제목 수정
	public void changeTitle(int idx, String title) {
		list.get(idx).setTitle(title);		
	}
	
	// 내용 수정
	public void changeContent(int idx, String content) {
		list.get(idx).setContent(content);		
	}
	
	// 글 삭제
	public void delBoardList(int idx) {
		list.remove(idx);
	}

}
