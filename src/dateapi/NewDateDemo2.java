package dateapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class NewDateDemo2 {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate date1 = LocalDate.of(2019, Month.FEBRUARY, 10);
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.ofYearDay(2019, 15);
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.ofEpochDay(10);
		System.out.println(date3);
	}
}
