package cf.rodolfo.Introduction;

public class class07Arrays03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] numbers = new int[3];
		int[] numbers2 = { 1, 2, 3, 4, 5 };
		System.out.println("Normal FOR");
		for (int i = 0; i < numbers2.length; i++) {
			System.out.print(numbers2[i] + " ");
		}
		System.out.println("\n");
		System.out.println("FOR EACH");
		for (int i : numbers2) {
			System.out.print(i + " ");
		}

	}
}
