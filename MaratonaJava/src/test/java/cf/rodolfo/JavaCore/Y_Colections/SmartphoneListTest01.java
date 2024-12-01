package cf.rodolfo.JavaCore.Y_Colections;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
	public static void main(String[] args) {
		Smartphone smartphone1 = new Smartphone("1ABC1", "iPhone");
		Smartphone smartphone2 = new Smartphone("22222", "Pixel");
		Smartphone smartphone3 = new Smartphone("33333", "Samsung");
		
		List<Smartphone> smartphones = new ArrayList<>();
		smartphones.add(smartphone1);
		smartphones.add(smartphone2);
		smartphones.add(smartphone3);
		
		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone);
		}
		System.out.println("");
		
		Smartphone smartphone4 = new Smartphone("22222", "Pixel");
		boolean isContains = smartphones.contains(smartphone4);
		System.out.println(isContains);
		
		System.out.println("");
		
		int indexOfSmartphone4 = smartphones.indexOf(smartphone4);
		System.out.println(indexOfSmartphone4);
		
		System.out.println("");
		
		smartphones.add(0, smartphone4);
		indexOfSmartphone4 = smartphones.indexOf(smartphone4);
		System.out.println(indexOfSmartphone4);
		
		
		
		
		
		
	}
}
