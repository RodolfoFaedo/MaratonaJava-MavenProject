package cf.rodolfo.JavaCore.U_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
	public static void main(String[] args) {
		/*
		  \d = retorna todos os dígitos
		  \D = retorna tudo que não for dígito
		  \s = retorna todos os espaços em branco - \t, \n, \f, \r
		  \S = retorna todo os caracteres, menos os espaços em branco
		  \w = retorna todos os caracteres (a-z, A-Z), os dígitos e o _
		  \W = retorna tudo que não for incluso no \w
		  \[] (range)
		*/
		String regex = "[a-zA-C]";
		String text = "cafeBABE";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		System.out.printf("Regex: %s%n", regex);
		System.out.printf("Text : %s%n", text);
		System.out.printf("Index: 0123456789%n");
		System.out.printf("Found positions: %n");
		while (matcher.find()) {
			System.out.println(matcher.start() + " - " + matcher.group() + "\n");
		}

		//System.out.println("\n");
		
		String regex2 = "0[xX][0-9a-fA-F]";
		String text2 = "12 0x 0X 0xFFABC 0x109 0x1";
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(text2);
		System.out.printf("Regex: %s%n", regex2);
		System.out.printf("Text : %s%n", text2);
		System.out.printf("Index: 0123456789%n");
		System.out.printf("Found positions: %n");
		while (matcher2.find()) {
			System.out.println(matcher2.start() + " - " + matcher2.group() + "\n");
		}

		System.out.println("\n");
	}
}
