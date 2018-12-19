package hours24;

import java.time.*;
import java.time.temporal.*;

public class clock {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		int hour = now.get(ChronoField.HOUR_OF_DAY);
		int minute = now.get(ChronoField.MINUTE_OF_HOUR);
		int month = now.get(ChronoField.MONTH_OF_YEAR);
		int day = now.get(ChronoField.DAY_OF_MONTH);
		int year = now.get(ChronoField.YEAR);
		
		
		// Clock
		System.out.println((hour < 18) ? "Dzień dobry. \n" : "Dobry wieczór. \n");
		
		if (minute != 0) {
			if(minute == 1) {
				System.out.print("Jest " + minute + " minuta");
			} else if (minute > 10 && minute < 20){
				System.out.print("Jest " + minute + " minuta");
			} else if (minute % 10 < 2){
				System.out.print("Jest " + minute + " minuta");
			} else if (minute % 10 < 5) {
				System.out.print("Są " + minute + " minuty");
			} else {
				System.out.print("Jest " + minute + " minut");
			}
				System.out.print(" po godzinie");
		} else {
			System.out.print("Jest godzina");
		}
		
		System.out.print(" " + hour + ", ");
		
		System.out.print("dnia " + day + " ");
		
		switch(month) {
		case 1:
			System.out.print("stycznia");
		case 2:
			System.out.print("luty");
		case 3:
			System.out.print("marca");
		case 4:
			System.out.print("kwietnia");
		case 5:
			System.out.print("maja");
		case 6:
			System.out.print("czerwca");
		case 7:
			System.out.print("lipca");
		case 8:
			System.out.print("sierpnia");
		case 9:
			System.out.print("września");
		case 10:
			System.out.print("października");
		case 11:
			System.out.print("listopada");
		case 12:
			System.out.print("grudnia");
		}
		
		System.out.print(" " + year + " roku.");
		
	}
}
