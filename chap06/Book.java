package chap06;

public class Book {
	// 객체 생성
	// 필드는 외부 접근 불가
	// getter,setter 생성
	// 생성자를 이용해서 필드 초기화

	// field
	private int bookNum;
	private String title;
	private int money;
	
	// constructor
    
    Book(int bookNum, String title, int money){
    	this.bookNum = bookNum;
    	this.title = title;
    	this.money = money;
    }

	
	// method
    
    // getter, setter
    public int getBookNum() {
		return bookNum;
	}


	public String getTitle() {
		return title;
	}

	public int getMoney() {
		return money;
	}

	
}
