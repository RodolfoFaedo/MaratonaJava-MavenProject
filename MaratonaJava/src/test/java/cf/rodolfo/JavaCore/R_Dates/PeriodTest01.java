package cf.rodolfo.JavaCore.R_Dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {
	public static void main(String[] args) {
		LocalDate beginingWW2 = LocalDate.of(1939, Month.SEPTEMBER, 01);
		LocalDate endingWW2 = LocalDate.of(1945, Month.MAY, 8);
		Period p1 = Period.between(beginingWW2, endingWW2);
		System.out.println(p1);
	}
}
