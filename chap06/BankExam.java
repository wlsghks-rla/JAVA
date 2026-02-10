package chap06;

public class BankExam {

	public static void main(String[] args) {
		Bank bank1 = new Bank("홍길동", "101-102525-22");
		System.out.printf("예금주: %s, 계좌: %s\n", bank1.getName(), bank1.getBankNum());
		
		// 입금
		bank1.input(10000);
				
		//출금
		bank1.output(11000);
		
		//잔액조회
		bank1.remain();
		System.out.printf("현재 %s님의 %s계좌의 잔액은 %d입니다.\n",bank1.getName(), bank1.getBankNum(), bank1.getMoney());
		System.out.println();
		
        Bank bank2 = new Bank("가나다", "111-122525-33");
        System.out.printf("예금주: %s, 계좌: %s\n", bank2.getName(), bank2.getBankNum());
		
		// 입금
		bank2.input(50000);
				
		//출금
		bank2.output(11000);
		
		//잔액조회
		bank2.remain();
		System.out.printf("현재 %s님의 %s계좌의 잔액은 %d입니다.\n",bank2.getName(), bank2.getBankNum(), bank2.getMoney());


	}

}
