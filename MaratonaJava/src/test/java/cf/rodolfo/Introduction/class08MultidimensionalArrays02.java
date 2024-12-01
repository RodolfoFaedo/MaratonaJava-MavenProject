package cf.rodolfo.Introduction;

public class class08MultidimensionalArrays02 {
	public static void main(String[] args) {
		int[][] intArray = new int[4][];
		intArray[0] = new int[] { 1 };
		intArray[1] = new int[] { 2, 2 };
		intArray[2] = new int[] { 3, 3, 3 };
		intArray[3] = new int[] { 4, 4, 4, 4 };
		for (int[] baseArray : intArray) {
			for (int numbers : baseArray) {
				System.out.printf("%d  ", numbers);
			}
			System.out.printf("%n");
		}

		System.out.println("---------------");

		int[][] intArray2 = { { 1 }, { 2, 2 }, { 3, 3, 3 }, { 4, 4, 4, 4 } };
		for (int[] baseArray2 : intArray2) {
			for (int numbers2 : baseArray2) {
				System.out.printf("%d  ", numbers2);
			}
			System.out.printf("%n");
		}

	}

}
