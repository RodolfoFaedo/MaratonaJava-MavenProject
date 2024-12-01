package cf.rodolfo.JavaCore.R_Dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.of(20, 59, 59);
		System.out.println(localTime);
		LocalTime localTimeNow = LocalTime.now();
		System.out.println(localTimeNow);
		System.out.println(localTime);
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
		System.out.println(localTime.getNano());
		System.out.println(localTime.get(ChronoField.AMPM_OF_DAY));

	}
}
