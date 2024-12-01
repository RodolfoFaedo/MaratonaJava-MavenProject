package cf.rodolfo.JavaCore.B_Introduction_To_Methods;

public class StudentTest02 {
	public static void main(String[] args) {
		Student student01 = new Student();
		Student student02 = new Student();
		student01.name = "Longbotom";
		student01.age = 12;
		student01.gender = 'M';
		student02.name = "Lovegood";
		student02.age = 14;
		student02.gender = 'F';
		
		System.out.println("\n------------- Student01 -----------");
		student01.printStudentInfo();
		System.out.println("\n------------- Student02 -----------");
		student02.printStudentInfo();
	}
}
