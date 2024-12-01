package cf.rodolfo.JavaCore.S_Formatting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
	public static void main(String[] args) {
		String pattern = "'Passo Fundo', dd 'de' MMMM 'de' yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String sdf = simpleDateFormat.format(new Date());
		System.out.println(sdf);

	}

}
