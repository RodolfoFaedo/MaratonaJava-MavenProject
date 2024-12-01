package cf.rodolfo.JavaCore.A_Introduction_To_Class;

public class TeacherTest01 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.age = 42;
		teacher.name = "Lupin";
		teacher.gender = 'M';
		System.out.println(teacher.name + ", " + teacher.age + ", " + teacher.gender);
	}
}
