package chap06;

public class ShopService {
	// Singleton
	// field
	private static ShopService ss  = new ShopService();
	
	// constructor
	private ShopService() {}
	
	// method
	public static ShopService getInstance() {
		return ss;
	}

}
