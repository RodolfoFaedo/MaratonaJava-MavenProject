package cf.rodolfo.Introduction;

public class class05ConditionalsStructures06 {
	public static void main(String[] args) {
		// Use Switch Case
		// Given 1 to 7, print if is business day or weekend, considering 1 as sunday
		byte value = 5;
		switch (value) {
		case 1:
		case 7:
			System.out.println("Weekend");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Business day");
			break;
		default:
			System.out.println("Invalid option!");
			break;
		}
	}

}
