package ch11_api.sec07_date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex02_LocalDateTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.toString().substring(0,19).replace("T", " "));
		
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime.toString().substring(0,8));
		
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		System.out.printf("%d-%02d-%02d\n", year, month, day);
		
		DayOfWeek date = today.getDayOfWeek();
		System.out.println(date); 				// WEDNESDAY
		System.out.println(date.getValue());	// 3
		String[] dates = "일,월,화,수,목,금,토".split(",");
		System.out.println(dates[date.getValue()] + "요일");
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
	}

}
