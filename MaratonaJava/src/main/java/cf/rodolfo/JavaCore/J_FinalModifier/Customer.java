package cf.rodolfo.JavaCore.J_FinalModifier;

public class Customer {
	private String name;

	
	
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
