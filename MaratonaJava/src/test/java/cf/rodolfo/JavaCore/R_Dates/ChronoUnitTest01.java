package cf.rodolfo.JavaCore.R_Dates;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
	public static void main(String[] args) {
		LocalDateTime beginingWW2 = LocalDateTime.of(1939, Month.SEPTEMBER, 01, 04, 45, 0);
		LocalDateTime endingWW2 = LocalDateTime.of(1945, Month.MAY, 8, 23, 01, 0);
		System.out.printf("Years: %d years%n", ChronoUnit.YEARS.between(beginingWW2, endingWW2));
		System.out.printf("Days: %d days%n", ChronoUnit.DAYS.between(beginingWW2, endingWW2));
		System.out.printf("Seconds: %d seconds%n", ChronoUnit.SECONDS.between(beginingWW2, endingWW2));
	}
}
