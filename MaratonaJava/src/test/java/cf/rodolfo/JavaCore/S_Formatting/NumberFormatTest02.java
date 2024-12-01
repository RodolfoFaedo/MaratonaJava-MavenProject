package cf.rodolfo.JavaCore.S_Formatting;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
	public static void main(String[] args) {
		Locale localeJapan = Locale.JAPAN;
		Locale localeItaly = Locale.ITALY;
		Locale localeUS = Locale.of("en", "US");
		Locale localeAustralia = Locale.of("en", "AU");

		NumberFormat[] numberFormatArray = new NumberFormat[4];
		numberFormatArray[0] = NumberFormat.getCurrencyInstance(localeJapan);
		numberFormatArray[1] = NumberFormat.getCurrencyInstance(localeUS);
		numberFormatArray[2] = NumberFormat.getCurrencyInstance(localeAustralia);
		numberFormatArray[3] = NumberFormat.getCurrencyInstance(localeItaly);

		double value = 10000.230;
		for (NumberFormat numberFormat : numberFormatArray) {
			System.out.println(numberFormat.format(value));
			System.out.println(numberFormat.getMaximumFractionDigits());
			numberFormat.setMaximumFractionDigits(3);
			System.out.println(numberFormat.getMaximumFractionDigits());
		}
		
		String stringValue = "$10000.230";
		try {
			System.out.println(numberFormatArray[2].parse(stringValue));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
