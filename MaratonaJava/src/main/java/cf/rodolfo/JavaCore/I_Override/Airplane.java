package cf.rodolfo.JavaCore.I_Override;

public class Airplane {
	private String name;

	public Airplane(String name) {
		super();
		this.name = name;
	}

	@Override	
	public String toString() {
		return "Name: " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
