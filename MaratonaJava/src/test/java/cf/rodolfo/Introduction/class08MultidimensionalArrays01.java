package cf.rodolfo.Introduction;

public class class08MultidimensionalArrays01 {
	public static void main(String[] args) {

		int[][] numbers = new int[3][3];

		numbers[0][0] = 00;
		numbers[0][1] = 01;
		numbers[0][2] = 02;

		numbers[1][0] = 10;
		numbers[1][1] = 11;
		numbers[1][2] = 12;

		numbers[2][0] = 20;
		numbers[2][1] = 21;
		numbers[2][2] = 22;

		System.out.println("Normal FOR");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				System.out.printf("%2d  ", numbers[i][j]);
			}
			System.out.printf("%n");
		}
		
		System.out.println("\n");
		
		System.out.println("FOR EACH");
		for (int[] baseArray : numbers) {
			for (int n : baseArray) {
				System.out.printf("%2d  ", n);
			}
			System.out.printf("%n");
		}

	}
}
