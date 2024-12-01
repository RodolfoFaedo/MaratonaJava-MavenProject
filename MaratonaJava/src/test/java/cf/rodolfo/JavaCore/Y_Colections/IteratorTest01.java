package cf.rodolfo.JavaCore.Y_Colections;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest01 {
	public static void main(String[] args) {
		List<Mediciness> mediciness = new ArrayList<>();
		mediciness.add(new Mediciness(5L, "Corus", 19.9, 0));
		mediciness.add(new Mediciness(1L, "Runner", 9.5, 5));
		mediciness.add(new Mediciness(4L, "AAS", 3.2, 0));
		mediciness.add(new Mediciness(3L, "Britens", 11.20,2));
		mediciness.add(new Mediciness(2L, "Luftal", 2.99, 0));
		
//		Iterator<Mediciness> medIterator = mediciness.iterator();
//		while(medIterator.hasNext()) {
//			Mediciness medicine = medIterator.next();
//			if(medicine.getQuantity() == 0) {
//				medIterator.remove();
//			}
//		}
//		System.out.println(mediciness);
		
		mediciness.removeIf(medicine -> medicine.getQuantity() == 0);
		System.out.println(mediciness);
	}

}
