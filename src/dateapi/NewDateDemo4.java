package dateapi;

import java.time.Clock;
import java.time.LocalDateTime;

public class NewDateDemo4 {
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now().withHour(15);
		System.out.println(dateTime);
		
		LocalDateTime dateTime1 = LocalDateTime.now(Clock.systemDefaultZone());
		System.out.println(dateTime1);
		
	}
}
