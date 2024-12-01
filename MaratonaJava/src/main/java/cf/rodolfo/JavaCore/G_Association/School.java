package cf.rodolfo.JavaCore.G_Association;

public class School {
	private String name;
	private Teacher[] teachers;

	public School(String name) {
		this.name = name;
	}

	public School(String name, Teacher[] teachers) {
		this.name = name;
		this.teachers = teachers;
	}

	public void printInfo() {
		System.out.printf("School's name: %s%n", this.name);
		if (teachers != null) {
			for (Teacher teacher : teachers) {
				System.out.printf("Teacher's name: %s%n", teacher.getName());
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher[] getTeachers() {
		return teachers;
	}

	public void setTeachers(Teacher[] teachers) {
		this.teachers = teachers;
	}

}
