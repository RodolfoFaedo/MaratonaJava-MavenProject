package cf.rodolfo.JavaCore.B_Introduction_To_Methods;

public class Student {
	public String name;
	public int age;
	public char gender;
	
	public void printStudentInfo() {
		
		System.out.printf("Name: %s%n", this.name);
		System.out.printf("Age: %d%n", this.age);
		System.out.printf("Gender: %s%n", this.gender);
	}
}
