package cf.rodolfo.Introduction;

public class class02PrimitiveTypes {
	public static void main(String[] args) {
		// int, double, float, char, byte, short, long, boolean
		int age = 10;
		long bigNumber = 100000L;
		double doubleSalary = 2000.25;
		float floatSalary = 2500.3214F;
		byte byteAge = 10;
		short shortAge = 10;
		boolean isTrue = true;
		boolean isFalse = false;
		char character = 'M';
		String name = "Goku";
		
		System.out.printf("int: %d%n", age);
		System.out.printf("long: %d%n", bigNumber);
		System.out.printf("double: %.2f%n", doubleSalary);
		System.out.printf("float: %.3f%n", floatSalary);
		System.out.printf("byte: %d%n", byteAge);
		System.out.printf("short: %d%n", shortAge);
		System.out.printf("boolean: %s%n", isTrue);
		System.out.printf("boolean: %s%n", isFalse);
		System.out.printf("char: %s%n", character);
		System.out.printf("String: %s%n", name);
		
		
	}
}
