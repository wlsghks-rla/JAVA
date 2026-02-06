package chap04;

public class Ifelse {

	public static void main(String[] args) {
		// 정수 3개, 총점, 평균, 등급
		// 출력 총점, 평균, 등급을 한줄에 출력
		
		// if문
		int html = 100;
		int js = 99;
		int java = 88;
		
		int tot = html + js + java;
		double avg = tot / 3.0;
				
		String grade = "";
//		
//		if(avg >= 90) {
//			grade = "A";
//		} else if(avg >= 80) {
//			grade = "B";
//		} else if(avg >= 70) {
//			grade = "C";
//		} else if(avg >= 60) {
//			grade = "D";
//		} else {
//			grade = "F";
//		}
//		
//		System.out.println("평균: " + avg + ", 등급: " + grade);
		
		// switch문 변경
		switch((int)avg/10) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F";
		}
		
		System.out.printf("총점=%d, 평균=%.2f, 등급=%s\n",tot, avg, grade);

	}

}
