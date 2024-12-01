package cf.rodolfo.JavaCore.Q_String;

public class StringTest01 {
	public static void main(String[] args) {
		String name = "Rowena"; // String constant pool
		String name2 = "Rowena";
		boolean isEqual = name.equals(name2);
		System.out.printf("The value of the strings \"name\" and \"name2\" are equals? %s%n%n",
				isEqual);
		System.out.printf("The strings \"name\" and \"name2\" are referring to the "
				+ "same object in memory? %s%n%n", name == name2);

		name.concat(" Ravenclaw");
		name = name.concat(" Ravenclaw");
		System.out.println(name);
		System.out.printf("The strings \"name\" and \"name2\" are referring to the "
				+ "same object in memory? %s%n%n", name == name2);

		String name3 = new String("Rowena");
		/*
		 * 1: creating a reference variable; 2: creating a string type
		 * object; 3: creating a string on string pool;
		 */
		System.out.printf("The strings \"name2\" and \"name3\" are referring to the "
				+ "same object in memory? %s%n%n", name2 == name3);
		System.out.printf("The strings \"name2\" and \"name3\" are referring to the "
				+ "same object in memory? %s%n%n", name2 == name3.intern());
		/*
		 * interns: return a canonical representation for the string object
		*/

	}

}
