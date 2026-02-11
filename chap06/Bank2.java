package chap06;

public class Bank2 {
	// field
    private String ano;
    private String owner;
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	// constructor
	Bank2(){}	

	Bank2(String ano, String owner, int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// method
	// 초기입금액
	boolean firstIn(int value) {
		if(value < MIN_BALANCE || value > MAX_BALANCE ) {
			return false;
		}
		return true;
	}
	
	// 예금,출금
	int moneyIn(int value) {
		int result = balance + value;
		return result;
	}

	// getter, setter
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
