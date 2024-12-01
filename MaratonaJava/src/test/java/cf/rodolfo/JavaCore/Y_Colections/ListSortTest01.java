package cf.rodolfo.JavaCore.Y_Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
	public static void main(String[] args) {
		List<String> mediciness = new ArrayList<String>();
		mediciness.add("Corus");
		mediciness.add("Runner");
		mediciness.add("AAS");
		mediciness.add("Britens");
		mediciness.add("Luftal");

		Collections.sort(mediciness);

		for (String medicines : mediciness) {
			System.out.println(medicines);
		}

	}
}
