package cf.rodolfo.JavaCore.L_AbstractsClasses;

public abstract class Employee extends Person{
	protected String name;
	protected double salary;
	protected float bonus;
	protected float finalSalary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		bonusCalculator();
	}

	public abstract void bonusCalculator();

	@Override
	public void print() {
		System.out.println("Printing...");
	}
	
	

}
