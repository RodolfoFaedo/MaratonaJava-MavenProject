package cf.rodolfo.JavaCore.Y_Colections;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		List<String> names2 = new ArrayList<>();
		names.add("Tylenol");
		names.add("Corus");
		names.add("Runner");
		names.add("Fledoid");
		names2.add("Anlodipino");
		names2.add("Hidroclorotiazida");

		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("");

		// names.remove(0);
		// names.remove("Runner");
		// for (String name : names) {
		// System.out.println(name);
		// }
		// System.out.println("");

		names.addAll(names2);
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("");

		// ArrayList'S toString()
//		System.out.println(names);
//		
//		System.out.println("");

		// For Index
//		for (int i = 0; i < names.size(); i++) {
//			String name = names.get(i);
//			System.out.println(name);
//			
//		}

	}
}
