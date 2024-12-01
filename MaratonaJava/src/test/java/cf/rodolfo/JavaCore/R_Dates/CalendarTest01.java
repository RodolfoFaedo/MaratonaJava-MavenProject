package cf.rodolfo.JavaCore.R_Dates;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println(date);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		
		
		System.out.println(calendar.getCalendarType());
		

	}

}
