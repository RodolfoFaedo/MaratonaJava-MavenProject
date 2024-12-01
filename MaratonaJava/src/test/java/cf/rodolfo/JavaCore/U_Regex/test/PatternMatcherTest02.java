package cf.rodolfo.JavaCore.U_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
	public static void main(String[] args) {
		/*
		  \d = retorna todos os dígitos
		  \D = retorna tudo que não for dígito
		  \s = retorna todos os espaços em branco - \t, \n, \f, \r
		  \S = retorna todo os caracteres, menos os espaços em branco
		  \w = retorna todos os caracteres (a-z, A-Z), os dígitos e o _
		  \W = retorna tudo que não for incluso no \w
		*/
		String regex = "\\s";
		String text = "@#hh_j2 12gvh21";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		System.out.printf("Regex: %s%n", regex);
		System.out.printf("Text : %s%n", text);
		System.out.printf("Index: 0123456789%n");
		System.out.printf("Found positions: ");
		while (matcher.find()) {
			System.out.print(matcher.start() + " ");
		}

//		System.out.println("\n");
//		String text2 = "abababa";
//		String regex2 = "aba";
//		Pattern pattern2 = Pattern.compile(regex2);
//		Matcher matcher2 = pattern2.matcher(text2);
//		System.out.printf("Regex: %s%n", regex2);
//		System.out.printf("Text : %s%n", text2);
//		System.out.printf("Index: 012345%n");
//		System.out.printf("Found positions: ");
//		while (matcher2.find()) {
//			System.out.print(matcher2.start() + " ");
//		}
	}
}
