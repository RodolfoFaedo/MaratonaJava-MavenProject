package cf.rodolfo.JavaCore.G_Association;

public class Seminary {
	private String title;
	private Student[] students;
	private Local local;

	public Seminary(String title) {
		this.title = title;
	}

	public Seminary(String title, Student[] students) {
		this.title = title;
		this.students = students;
	}

	public Seminary(String title, Student[] students, Local local) {
		this.title = title;
		this.students = students;
		this.local = local;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
