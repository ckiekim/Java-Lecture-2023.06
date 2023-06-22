package ch04;

import java.util.Scanner;

public class Ex03_Alarm {

	public static void main(String[] args) {
		int hour, minute, newHour, newMin;
		Scanner scan = new Scanner(System.in);
		hour = scan.nextInt();
		minute = scan.nextInt();
		scan.close();
		
		if (minute >= 45) {
			newHour = hour;
			newMin = minute - 45;
		} else {
			newHour = (hour + 24 - 1) % 24;
			newMin = minute + 60 - 45;
		}
		System.out.printf("%02d:%02d", newHour, newMin);
	}

}
