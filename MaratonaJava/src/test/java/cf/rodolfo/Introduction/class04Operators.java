package cf.rodolfo.Introduction;

public class class04Operators {
	public static void main(String[] args) {
		// Operadores Aritméticos: + - / *
		double number01 = 10;
		double number02 = 20;
		System.out.printf("Sum: %.1f%n", number01 + number02);
		System.out.printf("Subtraction: %.1f%n", number01 - number02);
		System.out.printf("Division: %.1f%n", number01 / number02);
		System.out.printf("Multiplication: %.1f%n", number01 * number02);

		System.out.println("------------------------------------------");

		// Operador de Resto: % ( se for 0 é par, se for diferente de 0, é ímpar)
		double number03 = 2;
		double number04 = 20;
		System.out.printf("Division: %.1f%n", number03 / number04);
		System.out.printf("Rest: %.1f%n", number03 % number04);

		System.out.println("------------------------------------");

		// Operadores Lógicos: < > <= >= == !=
		int number05 = 1;
		int number06 = 2;
		int number07 = 1;
		int number08 = 4;
		System.out.printf("Number06 is less than Number05: %s%n", number06 < number05);
		System.out.printf("Number08 is greater than Number05: %s%n", number08 > number05);
		System.out.printf("Number03 is less than or equal Number04: %s%n", number03 <= number04);
		System.out.printf("Number03 is greater than or equal Number04: %s%n", number03 >= number04);
		System.out.printf("Number07 is equal to Number05: %s%n", number07 == number05);
		System.out.printf("Number07 is different than Number05: %s%n", number07 != number05);
		
		System.out.println("------------------------------------");
		
		// Operadores Lógicos: && || 
		int age = 35;
		float salary = 3500;
		boolean isLegall1 = age > 30 && salary >= 4612;
		boolean isLegall2 = age < 30 && salary > 3381;
		System.out.printf("Legall 1? %s%n",  isLegall1);
		System.out.printf("Legall 2? %s%n",  isLegall2);
		double checkingAccountAmount = 200;
		double savingAccountAmount = 10000;
		float ps5Value = 5000;
		boolean isPS5Buyable = checkingAccountAmount > ps5Value || savingAccountAmount > ps5Value;
		System.out.printf("Is PS5 buyable? %s%n", isPS5Buyable);
		
		System.out.println("------------------------------------");
		
		// Operadores de Atribuição: = += -= *= /= %= 
		double bonus = 1800;
		System.out.println(bonus);
		bonus += 1000;
		System.out.println(bonus);
		bonus -= 1000;
		System.out.println(bonus);
		bonus *= 2;
		System.out.println(bonus);
		bonus /= 6;
		System.out.println(bonus);
		bonus %= 7;
		System.out.println(bonus);
		//Incrementador ++, Decrementador --
		int counter = 0;
		counter++;
		counter++;
		System.out.println(counter);
		counter--;
		System.out.println(counter);
		int counter2 = 0;
		System.out.printf("Pre-Increment: %s%n", ++counter2);
		int counter3 = 0;
		System.out.printf("Pos-Increment: %s%n", counter3++);
		
	}
}
