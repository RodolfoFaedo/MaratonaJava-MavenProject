package cf.rodolfo.Introduction;

public class class07Arrays02 {
	public static void main(String[] args) {
		String[] names = new String[3];
		names[0]= "Snape";
		names[1]= "Dumbledore";
		names[2]= "Lupin";
		for (int i = 0; i < names.length ; i++) {
			System.out.printf("Index: %d - Value: %s%n", i, names[i]);
		}
		
	}
}

