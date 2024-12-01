package cf.rodolfo.JavaCore.Y_Colections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		Integer[] listToArray = numbers.toArray(new Integer[0]);
		String listArraytoString = Arrays.toString(listToArray);
		System.out.println(listArraytoString);

		System.out.println("");

		Integer[] arrayToList = new Integer[3];
		arrayToList[0] = 1;
		arrayToList[1] = 2;
		arrayToList[2] = 3;
		List<Integer> asList = Arrays.asList(arrayToList);
		System.out.println(asList);
		List<Integer> numbersList = new ArrayList<>(Arrays.asList(arrayToList));
		numbersList.add(15);
		System.out.println(numbersList);

		System.out.println("");

		List<String> strings = Arrays.asList("1", "2");
		System.out.println(strings);
		List<String> listOf = List.of("1", "2");
		System.out.println(listOf);
	}
}
