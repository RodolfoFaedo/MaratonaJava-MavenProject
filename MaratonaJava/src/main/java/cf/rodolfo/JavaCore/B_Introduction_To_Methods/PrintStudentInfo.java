package cf.rodolfo.JavaCore.B_Introduction_To_Methods;

public class PrintStudentInfo {
	public void printStudentInfo(Student student) {
		System.out.println("\n------------------Student----------------");
		System.out.printf("Name: %s%n", student.name);
		System.out.printf("Age: %d%n", student.age);
		System.out.printf("Gender: %s%n", student.gender);
	}

}
