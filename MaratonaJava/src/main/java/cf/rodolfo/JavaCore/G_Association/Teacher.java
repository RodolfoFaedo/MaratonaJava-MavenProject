package cf.rodolfo.JavaCore.G_Association;

public class Teacher {
	private String name;
	private String speciality;
	private Seminary[] seminars;

	public Teacher(String name) {
		this.name = name;
	}

	public Teacher(String name, String speciality) {
		this.name = name;
		this.speciality = speciality;
	}

	public Teacher(String name, String speciality, Seminary[] seminars) {
		this.name = name;
		this.speciality = speciality;
		this.seminars = seminars;
	}

	public void printReport() {
		System.out.printf("Teacher: %s%n", this.name);
		if (this.seminars != null) {
			for (Seminary seminary : this.seminars) {
				System.out.printf("Seminars: %s%n", seminary.getTitle());
				System.out.printf("Local: %s%n", seminary.getLocal().getAddress());
				for (Student student : seminary.getStudents()) {
					System.out.printf("Student and Age: %s - %d years", student.getName(), student.getAge());
				}
				
			}
		}
	}

	public Seminary[] getSeminars() {
		return seminars;
	}

	public void setSeminars(Seminary[] seminars) {
		this.seminars = seminars;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
