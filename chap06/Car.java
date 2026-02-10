package chap06;

public class Car {
	// field
	private String company = "현대자동차"; //초기화
	private String model = "그랜저";
	private String color = "검정";
	private int maxSpeed = 350;
	private int speed;
	private boolean stop;
	
	public boolean isStop() { // getter
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;			
		}else {			
			this.speed = speed;
		}
	}
	
	// constructor
	
	// method

}
