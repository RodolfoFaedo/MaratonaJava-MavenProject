package cf.rodolfo.Introduction;

public class class06RepetitionStructures04 {
	public static void main(String[] args) {
		// Given a car value, find how many times this value can be portioned;
		// Condiiton: portion value >= 1000;
		double totalValue = 30000;
		double portionValue;
		for (int portion = 1; portion <= totalValue; portion++) {
			portionValue = totalValue / portion;
			if (portionValue >= 1000) {
				System.out.printf("%d portion of %.2f%n", portion, portionValue);
			} else {
				break;
			}

		}
	}
}
