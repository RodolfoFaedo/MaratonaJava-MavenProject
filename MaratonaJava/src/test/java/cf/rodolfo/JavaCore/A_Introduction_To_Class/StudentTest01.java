package cf.rodolfo.JavaCore.A_Introduction_To_Class;

public class StudentTest01 {
	public static void main(String[] args) {
		Student student01 = new Student();
		student01.name = "Fred";
		student01.age = 20;
		student01.gender = 'M';

		System.out.printf("Name: %s%n", student01.name);
		System.out.printf("Age: %d%n", student01.age);
		System.out.printf("Gender: %s%n", student01.gender);
		

	}
}
