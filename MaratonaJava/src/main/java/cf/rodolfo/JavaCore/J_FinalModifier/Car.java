package cf.rodolfo.JavaCore.J_FinalModifier;

public class Car {
	private String name;
	public static final double SPEED_LIMIT = 250;
	public final Customer CUSTOMER = new Customer();

	public final void printInfo() {
		System.out.printf("Name: %s%n", this.name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
