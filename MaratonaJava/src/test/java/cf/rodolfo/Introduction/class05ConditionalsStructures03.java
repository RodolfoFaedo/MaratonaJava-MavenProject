package cf.rodolfo.Introduction;

public class class05ConditionalsStructures03 {
	public static void main(String[] args) {
		// condition: donate if salary > 5000
		double salary = 3000;
		String donate = "I'll go donate.";	
		String notDonate = "Don't have conditions to donate.";
		//(condition) ? true : false
		String result = (salary > 5000) ? donate : notDonate;
		System.out.println(result);
	}

}
	