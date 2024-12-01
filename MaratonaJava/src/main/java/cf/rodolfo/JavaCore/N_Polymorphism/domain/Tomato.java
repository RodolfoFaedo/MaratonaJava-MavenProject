package cf.rodolfo.JavaCore.N_Polymorphism.domain;

public class Tomato extends Product {
	// double tax;
	public static final double TAX = 0.07;
	private String expirationDate;

	public Tomato(String name, double value) {
		super(name, value);

	}

	@Override
	public double taxCalculate() {
		System.out.println("Calculating tax of tomato:");
		return this.value * TAX;

	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

}
