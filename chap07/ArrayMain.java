package chap07;

public class ArrayMain {

	public static void main(String[] args) {
		double[] array1 = {1.1, 2, 99, 5.5, 0.1, 0.9};
		double[] array2 = {4.4, 20, -63, 10.8, 9, 0.5};
		
		System.out.print("첫번째 배열 ");
		System.out.println();
		minmaxValue(array1) ;
		
		System.out.print("두번째 배열");
		System.out.println();
		minmaxValue(array2) ;
		
	}

	private static void minmaxValue(double[] value) {
		double minVal = Double.MAX_VALUE;
		double maxVal = Double.MIN_VALUE;
		for(int i=0; i<value.length; i++) {
			
			if(value[i] < minVal) {
				minVal = value[i];
			}
			
			if(value[i] > minVal) {
				maxVal = value[i];
			}			
		}
		
		System.out.printf("최소값 : %.1f, 최대값 : %.1f\n", minVal, maxVal);		
		
	}

}
