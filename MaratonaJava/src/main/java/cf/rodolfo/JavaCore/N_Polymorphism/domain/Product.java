package cf.rodolfo.JavaCore.N_Polymorphism.domain;

public abstract class Product implements Taxable {
	protected String name;
	protected double value;

	public Product(String name, double value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	

}
