package cf.rodolfo.JavaCore.R_Dates;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest01 {
	public static void main(String[] args) {
		Map<String, String> shortIds = ZoneId.SHORT_IDS;
		System.out.println(shortIds + "\n");
		
		System.out.println(ZoneId.systemDefault() + "\n");
		
		ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
		System.out.println(tokyoZone + "\n");
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now + "\n");
		
		ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
		System.out.println(zonedDateTime +" \n");
		
		Instant instantNow = Instant.now();
		System.out.println(instantNow + "\n");
		
		ZonedDateTime zonedDateTime2 = instantNow.atZone(tokyoZone);
		System.out.println(zonedDateTime2 + "\n");
		
		System.out.println(ZoneOffset.MIN);
		System.out.println(ZoneOffset.MAX);
	}
}
