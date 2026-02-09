package chap05;

public class Mission {

	public static void main(String[] args) {
		// 5-1과제
		// 1
		int[] arrays = new int[10];
		int sum = 0;
		
		for(int arr : arrays) {
			arr = (int)(Math.random() * 100 + 1);
			sum += arr;
			System.out.print(arr + "\t");
		}
		System.out.println();
		System.out.print("합계 = "+ sum + "\n");
		
		// 2
		int[][] arrays2 = {
				{1,2,3},
				{1,2},
				{1},
				{1,2,3}
		};
		
		for(int i=0; i < arrays2.length; i++) {
			for(int arr : arrays2[i]) {
				System.out.print(arr);
			}
			System.out.println();
		}
		
		// 3
		int[][] arr3 = new int[3][10];
		sum = 0;
		
		for(int i=0; i < arr3.length; i++) {
			for(int arr : arr3[i]) {
				arr = (int)(Math.random() * 2);
				sum += arr;
				System.out.print(arr);
			}
			System.out.println();
		}
		System.out.println("관객 수: " + sum);
		
		// 4
		int[][] arr4 = new int[3][5];
		
		for(int i=0; i < arr4.length; i++) {			
			for(int j=0; j<arr4[i].length; j++) {
				arr4[i][j] = (int)(Math.random() * 51 + 50);				
				System.out.print(arr4[i][j] + "\t");
			}			
			System.out.println();			
		}
		
		for(int i=0; i < arr4.length; i++) {
			sum = 0;
			int avg = 0;
			for(int arr : arr4[i]) {				
				sum += arr;
			}						
			avg = sum / arr4[i].length;
			System.out.println(i+1 + "번 학생 평균 = " + avg);
		}
		
		// 5
		String[] arr51 = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] arr52 = {"2","3","4", "5", "6","7","8","9","10","Jack","Queen","King","Ace"};
		
		int num1 = (int)(Math.random() * arr51.length);
		int num2 = (int)(Math.random() * arr52.length);
		
		System.out.printf("%s의 %s\n",arr51[num1], arr52[num2]);
		
		// 6
		int[][] arr6 = new int[3][5];
		
		int count = 0;
		for(int i=0; i < arr6.length; i++) {
			for(int j=0; j < arr6[i].length; j++) {
				if(count == 5) break;				
				arr6[i][j] = (int)(Math.random() * 2);
				
				if(arr6[i][j] == 1) count++;
			}
			
		}
		
		for(int i=0; i < arr6.length; i++) {
			for(int j=0; j < arr6[i].length; j++) {						
				System.out.print(arr6[i][j]);
			}
			System.out.println();
		}

	}

}
