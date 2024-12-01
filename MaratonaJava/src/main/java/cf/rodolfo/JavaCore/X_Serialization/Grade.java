package cf.rodolfo.JavaCore.X_Serialization;

public class Grade {
	private String name;

	public Grade(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Grade [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
