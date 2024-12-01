package cf.rodolfo.JavaCore.Y_Colections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Consumer consumer1 = new Consumer("Lupin");
		Consumer consumer2 = new Consumer("Marauder");

		Mediciness medicine1 = new Mediciness(5L, "Corus", 19.9);
		Mediciness medicine2 = new Mediciness(1L, "Runner", 9.5);
		Mediciness medicine3 = new Mediciness(4L, "AAS", 3.2);
		Mediciness medicine4 = new Mediciness(3L, "Britens", 11.20);
		Mediciness medicine5 = new Mediciness(2L, "Luftal", 2.99);
		
		Map<Consumer, Mediciness> medicinessConsumer = new HashMap<>();
		medicinessConsumer.put(consumer1, medicine1);
		medicinessConsumer.put(consumer2, medicine4);
		for (Entry<Consumer, Mediciness> entry : medicinessConsumer.entrySet()) {
			System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
		}
	}

}
