package cf.rodolfo.JavaCore.Y_Colections;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
	public static void main(String[] args) {
		Set<Mediciness> mediciness = new HashSet<>();
		mediciness.add(new Mediciness(5L, "Corus", 19.9, 0));
		mediciness.add(new Mediciness(1L, "Runner", 9.5, 5));
		mediciness.add(new Mediciness(4L, "AAS", 3.2, 0));
		mediciness.add(new Mediciness(3L, "Britens", 11.20,2));
		mediciness.add(new Mediciness(2L, "Luftal", 2.99, 0));
		mediciness.add(new Mediciness(2L, "Luftal", 2.99, 0));
		
		for (Mediciness medicine : mediciness) {
			System.out.println(medicine);
		}
	}
}
