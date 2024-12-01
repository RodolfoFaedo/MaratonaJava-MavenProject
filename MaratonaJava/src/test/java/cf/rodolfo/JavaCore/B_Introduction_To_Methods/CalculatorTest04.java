package cf.rodolfo.JavaCore.B_Introduction_To_Methods;

public class CalculatorTest04 {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int number1 = 1;
		int number2 = 2;
		calculator.changeTwoNumbers(number1, number2);
		System.out.println("\nInside of CalculatorTest04:");
		System.out.printf("Number1: %d%n", number1);
		System.out.printf("Number2: %d%n", number2);
		
	}

}
