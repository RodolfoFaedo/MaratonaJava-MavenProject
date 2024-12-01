package cf.rodolfo.JavaCore.U_Regex.test;

import java.util.Scanner;

public class ScannerTest02 {
	public static void main(String[] args) {
		String text = "Boeing, Airbus, Embraer, true, 200";
		try (Scanner scan = new Scanner(text)) {
			scan.useDelimiter(",");
			while (scan.hasNext()) {
				if (scan.hasNextInt()) {
					int i = scan.nextInt();
					System.out.printf("Int: %d%n", i);
				} else if (scan.hasNextBoolean()) {
					boolean b = scan.nextBoolean();
					System.out.printf("Boolean: %s%n", b);
				} else {
					System.out.println(scan.next().trim());
				}

			}
		}

	}

}
