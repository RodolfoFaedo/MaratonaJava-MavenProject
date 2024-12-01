package cf.rodolfo.JavaCore.Y_Colections;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
	public static void main(String[] args) {
		NavigableMap<String, String> navigableMap = new TreeMap<>();
		navigableMap.put("A", "Letra A");
		navigableMap.put("D", "Letra D");
		navigableMap.put("B", "Letra B");
		navigableMap.put("C", "Letra C");
		navigableMap.put("E", "Letra E");
		
		for (Entry<String, String> entry : navigableMap.entrySet()) {
			System.out.println(entry);
		}
		System.out.println("");
		
		System.out.println(navigableMap.headMap("C"));
		System.out.println(navigableMap.headMap("C", true));
	}

}
