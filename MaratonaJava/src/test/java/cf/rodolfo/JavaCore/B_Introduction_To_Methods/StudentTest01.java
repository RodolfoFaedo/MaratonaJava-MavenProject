package cf.rodolfo.JavaCore.B_Introduction_To_Methods;

public class StudentTest01 {
	public static void main(String[] args) {
		Student student01 = new Student();
		Student student02 = new Student();
		PrintStudentInfo printer = new PrintStudentInfo();

		student01.name = "Tonks";
		student01.age = 30;
		student01.gender = 'F';

		student02.name = "Remo Lupin";
		student02.age = 40;
		student02.gender = 'M';

		System.out.println("\n-----------------Student01---------------");
		System.out.printf("Name: %s%n", student01.name);
		System.out.printf("Age: %d%n", student01.age);
		System.out.printf("Gender: %s%n", student01.gender);

		System.out.println("\n-----------------Student02---------------");
		System.out.printf("Name: %s%n", student02.name);
		System.out.printf("Age: %d%n", student02.age);
		System.out.printf("Gender: %s%n", student02.gender);
		
		printer.printStudentInfo(student01);
		printer.printStudentInfo(student02);
	}

}
