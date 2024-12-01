package cf.rodolfo.JavaCore.G_Association;

import java.util.Scanner;

public class InputScanTest01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		System.out.println("---------------------------");
		System.out.printf("Name: %s%n", name);
		System.out.printf("Age: %d%n", age);

		scan.close();
	}
}
