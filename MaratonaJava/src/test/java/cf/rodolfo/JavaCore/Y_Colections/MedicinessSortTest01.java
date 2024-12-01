package cf.rodolfo.JavaCore.Y_Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MedicinessByIdComparator implements Comparator<Mediciness> {

	@Override
	public int compare(Mediciness mediciness1, Mediciness mediciness2) {
		return mediciness1.getId().compareTo(mediciness2.getId());
	}

}

public class MedicinessSortTest01 {
	public static void main(String[] args) {
		List<Mediciness> mediciness = new ArrayList<>();
		mediciness.add(new Mediciness(5L, "Corus", 19.9));
		mediciness.add(new Mediciness(1L, "Runner", 9.5));
		mediciness.add(new Mediciness(4L, "AAS", 3.2));
		mediciness.add(new Mediciness(3L, "Britens", 11.20));
		mediciness.add(new Mediciness(2L, "Luftal", 2.99));

		for (Mediciness medicine : mediciness) {
			System.out.println(medicine);
		}

		System.out.println("");

		Collections.sort(mediciness);
		System.out.println("Sorted list by Name:");
		for (Mediciness medicine : mediciness) {
			System.out.println(medicine);
		}

		System.out.println("");

		// Collections.sort(mediciness, new MedicinessByIdComparator());
		mediciness.sort(new MedicinessByIdComparator());
		System.out.println("Sorted list by Id:");
		for (Mediciness medicine : mediciness) {
			System.out.println(medicine);
		}
	}

}
