package cf.rodolfo.JavaCore.U_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
	public static void main(String[] args) {
		/*
		  					METACARACTER
		  	\d = retorna todos os dígitos
		  	\D = retorna tudo que não for dígito
		  	\s = retorna todos os espaços em branco - \t, \n, \f, \r
		  	\S = retorna todo os caracteres, menos os espaços em branco
		  	\w = retorna todos os caracteres (a-z, A-Z), os dígitos e o _
		  	\W = retorna tudo que não for incluso no \w
		  	\[] (range)
		  	
		  					QUANTIFICADORES
		  	? = zero ou uma ocorrência
		  	* = zero ou mais de uma ocorrência
		  	+ = uma ou mais de uma ocorrência
		  	{n,m} = de n até m
		  	() = agrupamento
		  	| = ou
		  	$ = representa o fim da linha
		*/

		String regex = "([a-zA-Z0-9\\._-])+@([a-z])+\\.([a-z])+";
		String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		System.out.printf("This email \"#@!zoro@mail.br\" is valid? %s%n%n", "#@!zoro@mail.br".matches(regex));
		System.out.printf("This email \"luffy@hotmail.com\", is valid? %s%n%n", "luffy@hotmail.com".matches(regex));
		System.out.printf("Regex: %s%n", regex);
		System.out.printf("Text : %s%n", text);
		System.out.printf("Index: 0123456789%n");
		System.out.printf("Found positions: %n%n");
		while (matcher.find()) {
			System.out.println(matcher.start() + " - " + matcher.group() + "\n");
		}

		System.out.println("\n");
	}
}
