package cf.rodolfo.JavaCore.R_Dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class gettingNextBusinessDay implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporal) {
		DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
		int addDays = 0;
		switch (dayOfWeek) {
		case FRIDAY:
			addDays = 3;
			break;
		case SATURDAY:
			addDays = 2;
			break;
		case SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY:
			addDays = 1;
			break;
		}
		return temporal.plus(addDays, ChronoUnit.DAYS);
	}

}

public class TemporalAdjusterTest01 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.getDayOfWeek());

		System.out.println();

		now = LocalDate.now().with(new gettingNextBusinessDay());
		System.out.println(now);
		System.out.println(now.getDayOfWeek());

	}
}
