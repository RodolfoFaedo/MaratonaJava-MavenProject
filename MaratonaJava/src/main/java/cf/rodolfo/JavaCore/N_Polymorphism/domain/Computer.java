package cf.rodolfo.JavaCore.N_Polymorphism.domain;

public class Computer extends Product {
	public static final double TAX = 0.20;

	public Computer(String name, double value) {
		super(name, value);

	}

	@Override
	public double taxCalculate() {
		System.out.println("Calculating tax of computer:");
		double tax = this.value * TAX;
		return tax;
	}

}
