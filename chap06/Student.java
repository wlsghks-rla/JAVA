package chap06;

public class Student {
	// field
	private int studNum;
	private String StudName;
	private int studScore;
		
	// constructor
	Student(int studNum, String StudName, int studScore) {
		this.studNum = studNum;
		this.StudName = StudName;		
		this.studScore = studScore;		
	}
	
	// method
	
	// getter
	public int getStudNum() {
		return studNum;
	}

	public String getStudName() {
		return StudName;
	}

	public int getStudScore() {
		return studScore;
	}


}
