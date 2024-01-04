package java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test17 {

	public static void main(String[] args) {
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt=ZonedDateTime.now(la);
		System.out.println(zt);
	}

}
