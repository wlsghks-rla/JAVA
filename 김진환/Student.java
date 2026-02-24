package 김진환;



public class Student {
	// field
	private int studentNum;
	private String studentName;
	private int studentResult;
	
	// constructor
	Student(int studentNum, String studentName, int studentResult) {
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentResult = studentResult;
	}
	
	// getter
	public int getStudentNum() {
		return studentNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getStudentResult() {
		return studentResult;
	}
	
	@Override
	public String toString() {		
		return String.format("%d 학번 점수 : %d점", studentNum, studentResult);
	}
	
	
}
