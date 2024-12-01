package cf.rodolfo.JavaCore.R_Dates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class DurationTest01 {
	public static void main(String[] args) {
		LocalDateTime beginingWW2 = LocalDateTime.of(1939, Month.SEPTEMBER, 01, 04, 45);
		LocalDateTime endingWW2 = LocalDateTime.of(1945, Month.MAY, 8, 23, 01);
		Duration ww2Duration = Duration.between(beginingWW2, endingWW2);
		System.out.println(ww2Duration);
		 
	}
}
