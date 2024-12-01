package cf.rodolfo.JavaCore.B_Introduction_To_Methods;

public class CalculatorTest05 {
	public static void main(String... args) {
		Calculator calculator = new Calculator();
		int[] numbers = { 1, 2, 3, 4, 5 };
		calculator.sumArray(numbers);
		calculator.sumVarArgs(10, 20, 30, 40, 50);
	}

}
