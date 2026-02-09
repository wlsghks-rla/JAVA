package chap05;

public class Array_p208 {

	public static void main(String[] args) {
		// 배열
		System.out.println(args[0]);
		System.out.println(args[1]);
//		System.out.println(args[2]);

		// 1에서 100까지 난수 10개 발생해서 배열에 저장
		// 배열의 값의 합 출력
		int[] nums = new int[10]; // 0이 10개 들어가 있음.
		int sum = 0;
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() * 100) + 1;
			
			sum += nums[i];
		}
		System.out.printf("배열의 합 = %d\n", sum);
		
		// 2차원 배열
		int[][] scores = new int[2][3];
		for(int i=0; i<scores.length; i++) { // scores.length 행이 길이 2
			for(int j=0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random() * 100) + 1;				
				
			}		
			
		}
		// 배열 출력
		for(int i=0; i<scores.length; i++) { // scores.length 행이 길이 2
			for(int j=0; j < scores[i].length; j++) {
		System.out.print(scores[i][j] + "\t");
				}
			System.out.println();
		}
		
		// 배열 출력(향상된 for문으로 변경 -> for of와 비슷)
		for(int i=0; i<scores.length; i++) { // scores.length 행이 길이 2
			for(int score : scores[i]) {
		System.out.print(score + "\t");
				}
			System.out.println();
		}
		
		// 배열 복사
		int[] newArr = new int[15];
		for(int i=0; i<10; i++) {
			newArr[i] = nums[i]; 
		}
		
		for(int num : newArr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		// System.arraycopy() 활용
		int[] newArr2 = new int[15];
		System.arraycopy(nums, 0, newArr2, 0, nums.length);
		for(int num : newArr2) {
			System.out.print(num + " ");
		}
		
		
		
	} // end main

}
