package cf.rodolfo.JavaCore.Y_Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
	public static void main(String[] args) {
		MedicinessByIdComparator medicinessByIdComparator = new MedicinessByIdComparator();
		List<Mediciness> mediciness = new ArrayList<>();
		mediciness.add(new Mediciness(5L, "Corus", 19.9));
		mediciness.add(new Mediciness(1L, "Runner", 9.5));
		mediciness.add(new Mediciness(4L, "AAS", 3.2));
		mediciness.add(new Mediciness(3L, "Britens", 11.20));
		mediciness.add(new Mediciness(2L, "Luftal", 2.99));

		for (Mediciness medicines : mediciness) {
			System.out.println(medicines);
		}

		System.out.println("");

		// Collections.sort(mediciness);
//		for (Mediciness medicines : mediciness) {
//			System.out.println(medicines);
//		}
//		
		System.out.println("");

		Mediciness medicineToSearch = new Mediciness(4L, "AAS", 3.2);
		int binarySearch = Collections.binarySearch(mediciness, medicineToSearch);
		System.out.println(binarySearch);

		System.out.println("");

		mediciness.sort(medicinessByIdComparator);
		for (Mediciness medicines : mediciness) {
			System.out.println(medicines);
		}

		System.out.println("");

		medicineToSearch = new Mediciness(4L, "AAS", 3.2);
		binarySearch = Collections.binarySearch(mediciness, medicineToSearch, medicinessByIdComparator);
		System.out.println(binarySearch);

		System.out.println("");

	}
}
