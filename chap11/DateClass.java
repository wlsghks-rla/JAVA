package chap11;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// Date
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		
		System.out.println(now);
		System.out.println(sdf.format(now));
		
		
		// Calendar
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		
		String month = String.valueOf(today.get(Calendar.MONTH) + 1);
		if(Integer.parseInt(month) < 10) {
			month = 0+month;
		}
		
		int day = today.get(Calendar.DAY_OF_MONTH);
		
		int week = today.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		
		int hour = 0;
		int amPm = today.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.PM) {
			hour = today.get(Calendar.HOUR) + 12;			
		} else {
			hour = today.get(Calendar.HOUR);
		}
		
		
		int minute = today.get(Calendar.MINUTE);
		
		int second = today.get(Calendar.SECOND);
		
		System.out.printf("%d년 %s월 %d일 %s요일 %d:%d:%d", year, month, day, strWeek, hour, minute, second);

		// LocalDateTime Class
		LocalDateTime today2 = LocalDateTime.now();
		LocalDateTime xmas = LocalDateTime.of(2026,  12, 25, 0, 0, 0);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd.E요일"); // 날짜 형식 지정
		
		long remainYear = today2.until(xmas, ChronoUnit.YEARS);
		long remainMonth = today2.until(xmas, ChronoUnit.MONTHS); // +1없어도 됨.
		long remainDay = today2.until(xmas, ChronoUnit.DAYS);
		long remainHour = today2.until(xmas, ChronoUnit.HOURS);
		long remainMinute = today2.until(xmas, ChronoUnit.MINUTES);
		long remainSecond = today2.until(xmas, ChronoUnit.SECONDS);
		
		System.out.println("얼마나 남았을까? ---------------------");
		System.out.println("남은 해 : " +  remainYear);
		System.out.println("남은 월 : " +  remainMonth);
		System.out.println("남은 일 : " +  remainDay);
		System.out.println("남은 시 : " +  remainHour);
		System.out.println("남은 분 : " +  remainMinute);
		System.out.println("남은 초 : " +  remainSecond);
		
		System.out.println("\n 미래의 어느날 ---------------------");
		LocalDateTime resulty = today2.plusYears(1);
		LocalDateTime resultm = today2.plusMonths(1);
		LocalDateTime resultd = today2.plusDays(7);
		System.out.println("일년 후 : " + resulty.format(dtf));
		System.out.println("한달 후 : " + resultm.format(dtf));
		System.out.println("7일 후 : " + resultd.format(dtf));
		
		System.out.println("\n 과거의 어느날 ---------------------");
		LocalDateTime result_y = today2.minusYears(1);
		LocalDateTime result_m = today2.minusMonths(1);
		LocalDateTime result_d = today2.minusDays(7);
		System.out.println("일년 전 : " + result_y.format(dtf));
		System.out.println("한달 전 : " + result_m.format(dtf));
		System.out.println("7일 전 : " + result_d.format(dtf));
		
	}

}
