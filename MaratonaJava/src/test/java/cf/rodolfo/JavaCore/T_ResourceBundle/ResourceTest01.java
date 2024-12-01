package cf.rodolfo.JavaCore.T_ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceTest01 {
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("mensagem", Locale.of("pt", "BR"));
		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("good.morning"));
		
		System.out.println();
		
		bundle = ResourceBundle.getBundle("mensagem", Locale.of("en", "GB"));
		System.out.println(bundle.getString("olá"));
		System.out.println(bundle.getString("bom.dia"));
		
		System.out.println();
		
		bundle = ResourceBundle.getBundle("file");
		System.out.println(bundle.getString("hi"));
		
	}
}
