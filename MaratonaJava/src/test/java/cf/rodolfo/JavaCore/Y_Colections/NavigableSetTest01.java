package cf.rodolfo.JavaCore.Y_Colections;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneBrandComparator implements Comparator<Smartphone> {

	@Override
	public int compare(Smartphone o1, Smartphone o2) {
		return o1.getBrand().compareTo(o2.getBrand());
	}
}

class MedicinessPriceComparator implements Comparator<Mediciness> {

	@Override
	public int compare(Mediciness o1, Mediciness o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());
	}
}


public class NavigableSetTest01 {
	public static void main(String[] args) {
		NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
		Smartphone smartphone = new Smartphone("123", "Nokia");
		set.add(smartphone);

		NavigableSet<Mediciness> mediciness = new TreeSet<>(new MedicinessPriceComparator());
		mediciness.add(new Mediciness(5L, "Corus", 19.9, 0));
		mediciness.add(new Mediciness(1L, "Runner", 9.5, 5));
		mediciness.add(new Mediciness(4L, "Aciclovir", 3.2, 0));
		mediciness.add(new Mediciness(3L, "Britens", 11.20, 2));
		mediciness.add(new Mediciness(2L, "Luftal", 2.99, 0));
		mediciness.add(new Mediciness(10L, "Acetilcisteína", 2.99, 0));

		for (Mediciness medicine : mediciness) {
			System.out.println(medicine);
		}

		System.out.println("");
		
		Mediciness wegovy = new Mediciness(21L, "Wegovy", 9.35, 5);
		System.out.printf("Lower: %s%n", mediciness.lower(wegovy));
		System.out.printf("Floor: %s%n", mediciness.floor(wegovy));
		System.out.printf("Higher: %s%n", mediciness.higher(wegovy));
		System.out.printf("Ceiling: %s%n", mediciness.ceiling(wegovy));
		
		System.out.println("");
		
		System.out.println(mediciness.size());
		System.out.println(mediciness.pollFirst());
		System.out.println(mediciness.pollLast());
		System.out.println(mediciness.size());
		
	}

}
