package cf.rodolfo.JavaCore.S_Formatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
	public static void main(String[] args) {
		LocalDate localdate = LocalDate.now();
		String s1 = localdate.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = localdate.format(DateTimeFormatter.ISO_DATE);
		String s3 = localdate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		LocalDate parse1 = LocalDate.parse("20241107", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(parse1 + "\n");
		
		DateTimeFormatter brazilFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String brazilFormat = LocalDate.now().format(brazilFormatter);
		System.out.println(brazilFormat);
	}
}
