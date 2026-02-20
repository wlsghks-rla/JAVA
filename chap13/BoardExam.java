package chap13;

import java.util.List;
import java.util.Scanner;

public class BoardExam {

	public static void main(String[] args) {
		// 전체 출력/ 추가/ 조회/ 수정/ 삭제/ 기능 구현
		// 데이터 처리는 DAO에서
		// main에서 
		BoardDao dao = new BoardDao();
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.전체 출력 |2.추가 |3.조회 |4.수정 |5.삭제 |6.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("번호 입력>> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				System.out.print("1.전체 출력");
				System.out.println("-----------------------------------------------------");
				List<Board> list = dao.getBoardList();
				for(int i=0; i<list.size(); i++) {
					System.out.printf("%d. %s | %s | %s\n", i+1, list.get(i).getTitle(), list.get(i).getContent(),list.get(i).getWriter());
				}
				
				break;
			case 2:
				System.out.println("-----------------------------------------------------");
				System.out.println("2.추가");
				System.out.println("-----------------------------------------------------");
				System.out.print("제목을 입력해주세요 : ");
				String newTitle = sc.nextLine();
				System.out.print("내용을 입력해주세요 : ");
				String newContent = sc.nextLine();
				System.out.print("글쓴이를 입력해주세요 : ");
				String newWriter = sc.nextLine();
				
				boolean result2 = dao.insertBoardList(newTitle, newContent, newWriter);
				if(result2) {
					System.out.printf("%s | %s | %s 등록되었습니다.\n", newTitle, newContent, newWriter);
				}
				break;
				
			case 3:
				System.out.println("-----------------------------------------------------");
				System.out.println("3.조회");
				System.out.println("-----------------------------------------------------");
				System.out.print("글쓴이를 입력해주세요 : ");
				String searchWriter = sc.nextLine();
				
				dao.searchBoardList(searchWriter);				
				
				break;
			case 4:
				System.out.println("-----------------------------------------------------");
				System.out.println("4.수정");
				System.out.println("-----------------------------------------------------");				
				boolean change = true;
				while(change) {
				  list = dao.getBoardList();
				  for(int i=0; i<list.size(); i++) {
					  System.out.printf("%d. %s | %s | %s\n", i+1, list.get(i).getTitle(), list.get(i).getContent(),list.get(i).getWriter());
				  }
					  System.out.println("-----------------------------------------------------");
				  System.out.print("글 번호 선택해주세요.>> ");
				  int selectNum = Integer.parseInt(sc.nextLine());
				  if(selectNum > list.size() || selectNum < 0) {
					  System.out.println("1번에서 10번사이에 선택해주세요.");
					  continue;
				  } else {
					  System.out.println("-----------------------------------------------------");
					  System.out.print("수정 항목을 선택해주세요.(1.제목, 2.내용)");
					  int item = Integer.parseInt(sc.nextLine());
					  if(item != 1 && item != 2) {
						  System.out.println("1번과 2번중에 선택해주세요.");
						  continue;
					  } else {
						  switch(item) {
						  case 1:
							  System.out.println("-----------------------------------------------------");
							  System.out.print("새로운 제목을 입력해주세요.>> ");
							  String changeTitle = sc.nextLine();
							  dao.changeTitle(selectNum-1, changeTitle);
							  System.out.printf("내용을 '%s'로 수정하였습니다.\n", changeTitle);
							  change = false;
							  
						  case 2:
							  System.out.println("-----------------------------------------------------");
							  System.out.print("새로운 내용을 입력해주세요.>> ");
							  String changeContent = sc.nextLine();
							  dao.changeContent(selectNum-1, changeContent);
							  System.out.printf("내용을 '%s'로 수정하였습니다.\n", changeContent);
							  change = false;
						  }
					  }					  
				  }
					
				}
				
				
				break;
				
			case 5:
				System.out.println("-----------------------------------------------------");
				System.out.println("5.삭제");
				
				System.out.println("-----------------------------------------------------");				
				boolean delete = true;
				while(delete) {
				  list = dao.getBoardList();
				  for(int i=0; i<list.size(); i++) {
					  System.out.printf("%d. %s | %s | %s\n", i+1, list.get(i).getTitle(), list.get(i).getContent(),list.get(i).getWriter());
				  }
					  System.out.println("-----------------------------------------------------");
				  System.out.print("글 번호 선택해주세요.>> ");
				  int selectNum = Integer.parseInt(sc.nextLine());
				  if(selectNum > list.size() || selectNum < 0) {
					  System.out.println("1번에서 10번사이에 선택해주세요.");
					  continue;
				  } else {
					  dao.delBoardList(selectNum-1);
					  System.out.println("삭제완료");
					  delete = false;
				    }
				}
				break;
				
			case 6:
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
		
		

	}

}
