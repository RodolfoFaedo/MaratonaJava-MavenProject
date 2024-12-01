package cf.rodolfo.JavaCore.Y_Colections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
	public static void main(String[] args) {
		Queue<Mediciness> mediciness = new PriorityQueue<>(new MedicinessPriceComparator().reversed());
		mediciness.add(new Mediciness(5L, "Corus", 19.9, 0));
		mediciness.add(new Mediciness(1L, "Runner", 9.5, 5));
		mediciness.add(new Mediciness(4L, "Aciclovir", 3.2, 0));
		mediciness.add(new Mediciness(3L, "Britens", 11.20, 2));
		mediciness.add(new Mediciness(2L, "Luftal", 2.99, 0));
		mediciness.add(new Mediciness(10L, "Acetilcisteína", 2.99, 0));
		System.out.println(mediciness.size());
		
		System.out.println("");
		
		while(!mediciness.isEmpty()) {
			System.out.println(mediciness.poll());
		}
		
		System.out.println("");
		
		System.out.println(mediciness.size());
		
	}
}
