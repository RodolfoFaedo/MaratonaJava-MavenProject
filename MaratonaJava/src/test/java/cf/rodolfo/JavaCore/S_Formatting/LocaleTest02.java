package cf.rodolfo.JavaCore.S_Formatting;

import java.util.Locale;

public class LocaleTest02 {
	public static void main(String[] args) {
		Locale defaultLocale = Locale.getDefault();
		System.out.println(defaultLocale);
		
		String[] isoCountries = Locale.getISOCountries();
		String[] isoLanguages = Locale.getISOLanguages();
		for (String isoLanguage : isoLanguages) {
			System.out.print(isoLanguage + " ");
		}
		System.out.println();
		for (String isoCountry : isoCountries) {
			System.out.print(isoCountry + " ");
		}
	}
}
