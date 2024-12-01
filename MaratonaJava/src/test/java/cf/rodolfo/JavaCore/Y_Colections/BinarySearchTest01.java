package cf.rodolfo.JavaCore.Y_Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(0);
		numbers.add(4);
		numbers.add(3);
		// (-(ponto de inserção) -1;
		// index 0 | 1 | 2 | 3
		//values 0 | 2 | 3 | 4
		Collections.sort(numbers);
		System.out.println(Collections.binarySearch(numbers, 2));
		System.out.println(Collections.binarySearch(numbers, 1));
	}
}
