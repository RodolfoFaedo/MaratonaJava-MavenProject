package cf.rodolfo.JavaCore.G_Association;

public class Employee extends Person {
	private double salary;
	static {
		System.out.printf("Inside of Employee's STATIC inicialization block%n");
	}
	{
		System.out.printf("Inside of Employee's inicialization block 1%n");
	}
	{
		System.out.printf("Inside of Employee's inicialization block 2%n");
	}

	public Employee(String name) {
		super(name);
		System.out.printf("Inside of Employee's constructor%n");

	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("Salary: %.1f%n", salary);
	}

	public void paymentReport() {
		System.out.printf("I, %s, received my salary of $%.1f.", this.name, this.salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
