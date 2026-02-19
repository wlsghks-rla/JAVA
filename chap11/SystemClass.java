package chap11;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SystemClass {

	public static void main(String[] args) {
		// 1에서 1000000 합을 구하는데 걸린 시간(nanoS)
		int sum = 0;
		
		long start = System.nanoTime();
		
		for(int i=1; i<1000000; i++) {
			sum += i;
		}
		
		long end = System.nanoTime();
		
		System.out.println(sum);
		System.out.println("걸린시간 = " + (end - start) + "");
	}

}
