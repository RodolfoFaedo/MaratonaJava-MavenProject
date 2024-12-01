package cf.rodolfo.JavaCore.Y_Colections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("kiboard", "keyboard");
		map.put("mouze", "mouse");
		map.put("u", "you");
//		for(String key : map.keySet()) {
//			System.out.println(key + " = " + map.get(key));
//		}
		
//		for(String value : map.values()) {
//			System.out.println(value);
//		}
		
		for (Entry<String, String> keysAndValues : map.entrySet()) {
			System.out.println(keysAndValues);
		}

	}
}
