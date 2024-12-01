package cf.rodolfo.JavaCore.Q_String;

public class StringTest02 {
	public static void main(String[] args) {
		String name = "Neville";
		String name2 = "        Lupin                ";
		String numbers = "012345";
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		System.out.println(name.replace("l", "m"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.toUpperCase());
		
		System.out.println(numbers.length());
		System.out.println(numbers.substring(0, 2));
		
		System.out.println(name2);
		System.out.println(name2.trim());
	
		
	}
}
