package cf.rodolfo.JavaCore.R_Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate localDate = LocalDate.of(2003, Month.FEBRUARY, 01);
		LocalTime localTime = LocalTime.of(9, 45, 21); 
		System.out.println(localDateTime);
		System.out.println(localDate);
		System.out.println(localTime);
		
	}
}
