package dateapi;

import java.time.LocalTime;
import java.time.ZoneId;

public class NewDateDemo3 {
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalTime time1 = LocalTime.ofNanoOfDay(5000);
		System.out.println(time1);
		
		LocalTime time2 = LocalTime.now(ZoneId.systemDefault());
		System.out.println(time2);
	}
}
