package cf.rodolfo.JavaCore.B_Introduction_To_Methods;

public class Calculator {

	public void sumTwoNumbers() {
		System.out.printf("Sum = %d%n", 10 + 10);
	}

	public void subtractTwoNumbers() {
		System.out.printf("Subtraction = %d%n", 10 - 10);
	}

	public void multiplyTwoNumbers(int number1, int number2) {
		System.out.printf("Multiplication = %d%n", number1 * number2);
	}

	public double divideTwoNumbers(double number1, double number2) {
		if (number2 != 0) {
			return number1 / number2;
		} else {
			String message = "There isn't division by 0!";
			System.out.println(message);
			return 0;
		}
	}

	public void divideTwoNumbers2(double number1, double number2) {
		if (number2 == 0) {
			System.out.println("There isn't division by 0!");
		} else {
			double result = number1 / number2;
			System.out.println(result);
		}
	}

	public void changeTwoNumbers(int number1, int number2) {
		number1 = 99;
		number2 = 33;
		System.out.println("Inside of changeTwoNumbers:");
		System.out.printf("Number1: %d%n", number1);
		System.out.printf("Number2: %d%n", number2);
	}

	public void sumArray(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		System.out.printf("Sum Array: %d%n", sum);
	}

	public void sumVarArgs(int... numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		System.out.printf("Sum Var Args: %d%n", sum);
	}
}
