package chap06;

public class CarExam {

	public static void main(String[] args) {
		// 객체 생성
		Car mycar = new Car();
		
		System.out.println(mycar.getColor());
		System.out.println(mycar.getCompany());
		System.out.println(mycar.getModel());
		System.out.println(mycar.getMaxSpeed());
		System.out.println(mycar.getSpeed());
		
		// 필드 값 변경
		mycar.setSpeed(60);
		System.out.println(mycar.getSpeed());

		mycar.setSpeed(-50);
		System.out.println(mycar.getSpeed());
	}

}
