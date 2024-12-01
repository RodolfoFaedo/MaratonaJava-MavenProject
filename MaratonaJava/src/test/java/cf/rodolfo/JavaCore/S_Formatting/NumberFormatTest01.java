package cf.rodolfo.JavaCore.S_Formatting;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
	public static void main(String[] args) {
		Locale localeJapan = Locale.JAPAN;
		Locale localeItaly = Locale.ITALY;
		Locale localeUS = Locale.of("en", "US");
		Locale localeAustralia = Locale.of("en", "AU");

		NumberFormat[] numberFormatArray = new NumberFormat[4];
		numberFormatArray[0] = NumberFormat.getInstance(localeJapan);
		numberFormatArray[1] = NumberFormat.getInstance(localeUS);
		numberFormatArray[2] = NumberFormat.getInstance(localeAustralia);
		numberFormatArray[3] = NumberFormat.getInstance(localeItaly);

		double value = 10000.2130;
		for (NumberFormat numberFormat : numberFormatArray) {
			System.out.println(numberFormat.format(value));
		}
		String stringValue = "10000.230";
		try {
			System.out.println(numberFormatArray[2].parse(stringValue));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
