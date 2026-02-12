package chap07;

 public class CubeMain {
	static class Cube{
		
		int sumNum() {			
			int result = (int)(Math.random() * 6) + 1;
			return result;		
		}		
	}

	public static void main(String[] args) {
		boolean run = true;
		int count = 0;
		Cube dice = new Cube();
				
		while(run) {
		  count++;
		  int num1 = dice.sumNum();
		  int num2 = dice.sumNum();
		  System.out.printf("( %d, %d )", num1, num2);
		
		  if(num1 + num2 == 2) {
			  System.out.println();
			  System.out.printf("(1,1)이 나오는데 걸린 횟수 = %d\n", count);
			  run = false;
		  }
		}
	}

}
