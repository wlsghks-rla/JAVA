package chap07;

public class KumhoTire extends Tire{
	    // field
	
		// constructor
		public KumhoTire(String location, int maxRotation) {
			super(location, maxRotation);
		}
		
		// method
		@Override
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation<maxRotation) {
				System.out.printf("%s KumhoTire 수명: %s회\n", location, (maxRotation - accumulatedRotation));
				return true;
			} else {
				System.out.printf("*** %s KumhoTire 펑크 ***\n", location);
				return false;			
			}
				
		}
}
