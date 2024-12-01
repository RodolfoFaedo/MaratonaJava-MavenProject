package cf.rodolfo.Introduction;

public class class05ConditionalsStructures02 {
	public static void main(String[] args) {

		int age = 12;
		String category;
		if (age < 15) {
			category = "Childish Category";
			//System.out.println("Childish Category");
		} else if (age >= 15 && age < 18) {
			category = "Youthful Category";
			//System.out.println("Youthful Category");
		} else {
			category = "Adult Category";
			//System.out.println("Adult Category");
		}
		System.out.println(category);

	}
}
