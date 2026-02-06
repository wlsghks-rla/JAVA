package chap03;

public class Exam182 {

	public static void main(String[] args) {
		// 2
		int sum = 0;
		for(int i = 1; i < 100; i++) {			
			if(i % 3 == 0) {
				sum += + i;
			}
		}
		System.out.println("3의 배수 총 합 = " + sum);

		// 3
		while(true) {
			int fnum = (int)(Math.random() * 6 + 1);
			int snum = (int)(Math.random() * 6 + 1);
			System.out.printf("%d, %d\n",fnum, snum);
			if(fnum + snum == 5) {
				System.out.println("축하합니다. 합쳐서 5가 나왔습니다.");
				break;				
			} 
		}
	}

}
