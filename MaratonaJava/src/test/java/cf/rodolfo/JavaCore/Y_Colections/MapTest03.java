package cf.rodolfo.JavaCore.Y_Colections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Consumer consumer1 = new Consumer("Lupin");
		Consumer consumer2 = new Consumer("Marauder");

		Mediciness medicine1 = new Mediciness(5L, "Corus", 19.9);
		Mediciness medicine2 = new Mediciness(1L, "Runner", 9.5);
		Mediciness medicine3 = new Mediciness(4L, "AAS", 3.2);
		Mediciness medicine4 = new Mediciness(3L, "Britens", 11.20);
		Mediciness medicine5 = new Mediciness(2L, "Luftal", 2.99);

		List<Mediciness> medicinessConsumerList1 = List.of(medicine1, medicine2, medicine3);
		List<Mediciness> medicinessConsumerList2 = List.of(medicine4, medicine5);
		Map<Consumer, List<Mediciness>> medicinessConsumer = new HashMap<>();
		medicinessConsumer.put(consumer1, medicinessConsumerList1);
		medicinessConsumer.put(consumer2, medicinessConsumerList2);

		for (Entry<Consumer, List<Mediciness>> entry : medicinessConsumer.entrySet()) {
			System.out.println("->" + entry.getKey().getName());
			for (Mediciness medicine : entry.getValue()) {
				System.out.println("  ." + medicine.getName());
			}
			System.out.println("");

		}

	}

}
