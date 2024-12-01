package cf.rodolfo.JavaCore.S_Formatting;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// language-country
		Locale localeItaly = new Locale("it", "IT");
		Locale localeSwitzerland = Locale.of("it","CH");
		Locale localeIndia = Locale.of("hi", "IN");
		Locale localeNewZealand = Locale.of("en", "NZ");
		Calendar calendar = Calendar.getInstance();
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeNewZealand);
		System.out.printf("Italy: %s%n",df1.format(calendar.getTime()));
		System.out.printf("Switzerland: %s%n",df2.format(calendar.getTime()));
		System.out.printf("India: %s%n",df3.format(calendar.getTime()));
		System.out.printf("New Zealand: %s%n",df4.format(calendar.getTime()));
	}
}
