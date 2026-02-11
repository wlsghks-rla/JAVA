package chap07;

public class HankookTire extends Tire {
	// field
	
	// constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.printf("%s HankookTire 수명: %s회\n", location, (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.printf("*** %s HankookTire 펑크 ***\n", location);
			return false;			
		}
			
	}

}
