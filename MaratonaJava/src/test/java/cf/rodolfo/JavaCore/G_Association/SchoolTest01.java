package cf.rodolfo.JavaCore.G_Association;

public class SchoolTest01 {
	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Thomas Karpello");
		Teacher teacher2 = new Teacher("Magnus Lion");
		Teacher[] teachers = {teacher1, teacher2};
		School school = new School("Durmstrang", teachers);
		school.printInfo();
		
	}

}
