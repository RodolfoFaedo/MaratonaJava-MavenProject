package cf.rodolfo.Introduction;

public class class06RepetitionStructures01 {
	public static void main(String[] args) {
		// while
		int counter = 0;

		System.out.println("WHILE");
		while (counter <= 15) {
			System.out.print(counter + " ");
			counter++;
		}

		System.out.println("-------------------------------------");
		// do-while
		counter = 0;
		System.out.println("\nDO WHILE");
		do {
			System.out.print(counter + " ");
			++counter;
		} while (counter <= 15);

		System.out.println("-------------------------------------");
		// FOR
		System.out.println("\nFOR");
		for (int counter2 = 0; counter2 <= 15; counter2++) {
			System.out.print(counter2 + " ");
		}

	}
}
