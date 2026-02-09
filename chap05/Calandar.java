package chap05;

import java.util.Calendar;

public class Calandar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int today = cal.get(Calendar.DAY_OF_WEEK);
		Week day = null;
		
		switch(today) {
		case 1:
			day = Week.일요일; break;
		case 2:
			day = Week.월요일; break;
		case 3:
			day = Week.화요일; break;
		case 4:
			day = Week.수요일; break;
		case 5:
			day = Week.목요일; break;
		case 6:
			day = Week.금요일; break;
		case 7:
			day = Week.토요일; break;
		}
		System.out.println("오늘은 " + day + "입니다.");
		System.out.printf("%d년 %d월 %d일 입니다.",cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
	}

}
