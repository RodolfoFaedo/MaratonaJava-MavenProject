package cf.rodolfo.JavaCore.A_Introduction_To_Class;

public class StudentTest02 {
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student();
		System.out.println(student.age);
		System.out.println(student.gender);
		System.out.println(student.name);
		System.out.println("\n-----------------Student2---------------");
		System.out.println(student2.age);
		System.out.println(student2.gender);
		System.out.println(student2.name);
		student2.name = "Snape";
		System.out.println(student2.name);

	}
}
