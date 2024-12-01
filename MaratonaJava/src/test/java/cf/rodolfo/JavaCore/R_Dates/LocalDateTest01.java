package cf.rodolfo.JavaCore.R_Dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
	public static void main(String[] args) {
		// System.out.println(new Date());
		// System.out.println(Calendar.getInstance());

		LocalDate localDate = LocalDate.of(1995, Month.JANUARY, 28);
		System.out.println(localDate);
		System.out.printf("Year: %d%n", localDate.getYear());
		System.out.printf("Month: %s%n", localDate.getMonth());
		System.out.printf("Month value: %d%n", localDate.getMonthValue());
		System.out.printf("Length of the month: %d days%n", localDate.lengthOfMonth());
		System.out.printf("Day of the month: %d%n", localDate.getDayOfMonth());
		System.out.printf("Day of the week: %s%n", localDate.getDayOfWeek());
		System.out.printf("Day of the year: %d%n", localDate.getDayOfYear());
		System.out.printf("Length of the year: %d days%n", localDate.lengthOfYear());
		System.out.printf("The year, %d, is a leap year? %s%n", localDate.getYear(), localDate.isLeapYear());
		System.out.println(localDate.get(ChronoField.YEAR_OF_ERA));
		LocalDate localDateNow = LocalDate.now();
		System.out.println(localDateNow);
		System.out.println(LocalDate.MIN);
		System.out.println(LocalDate.MAX);

	}
}
