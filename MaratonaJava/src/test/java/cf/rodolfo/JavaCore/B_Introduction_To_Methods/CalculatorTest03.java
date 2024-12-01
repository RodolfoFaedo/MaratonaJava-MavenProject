package cf.rodolfo.JavaCore.B_Introduction_To_Methods;

public class CalculatorTest03 {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		double result = calculator.divideTwoNumbers(125, 0);
		System.out.printf("Divison: %.1f%n", result);
		calculator.divideTwoNumbers2(12, 0);
		calculator.divideTwoNumbers2(25, 0);
		
	}

}
