package chap06;

public class Bank {
	// field: 외부에서 접근하 수 없도록 접근제한
	// getter, setter 생성
	private String name;
	private String bankNum;
	private int money;
	
	// constructor
	  // 예금주, 계좌번호
	Bank(String name, String bankNum){
		this.name = name;
		this.bankNum = bankNum;
	}
	
	// method
	  // 입금
	void input(int value) {
		money += value;
		System.out.println(money + "원이 입금완료했습니다."); 
	}

	// 출금
	void output(int value) {
		if(value > money) {
			System.out.println("잔액이 부족합니다.");
			System.out.printf("출금 가능액은 %d입니다.\n", money);			
		} else {
			money -= value;		
			System.out.println(money + "원 출금완료했습니다.");
		}
	}
	  // 잔액조회
	void remain() {
		System.out.printf("잔액은 %d원 입니다.\n", money);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBankNum() {
		return bankNum;
	}
	
	public void setBankNum(String bankNum) {
		this.bankNum = bankNum;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
}
