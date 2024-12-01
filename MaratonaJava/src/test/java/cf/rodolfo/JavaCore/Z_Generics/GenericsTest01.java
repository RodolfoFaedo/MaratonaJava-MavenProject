
package cf.rodolfo.JavaCore.Z_Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Fulano");
		list.add("Fulano");
		
		for (String lists : list) {
			System.out.println(lists);
		}
	}

}
