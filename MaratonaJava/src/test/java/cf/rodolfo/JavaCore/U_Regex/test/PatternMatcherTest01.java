package cf.rodolfo.JavaCore.U_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
	public static void main(String[] args) {
		String regex = "ab";
		String regex2 = "aba";
		String text = "abaaba";
		String text2 = "abababa";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		System.out.printf("Regex: %s%n", regex);
		System.out.printf("Text : %s%n", text);
		System.out.printf("Index: 012345%n");
		System.out.printf("Found positions: ");
		while (matcher.find()) {
			System.out.print(matcher.start() + " ");
		}

		System.out.println("\n");

		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(text2);
		System.out.printf("Regex: %s%n", regex2);
		System.out.printf("Text : %s%n", text2);
		System.out.printf("Index: 012345%n");
		System.out.printf("Found positions: ");
		while (matcher2.find()) {
			System.out.print(matcher2.start() + " ");
		}
	}
}
