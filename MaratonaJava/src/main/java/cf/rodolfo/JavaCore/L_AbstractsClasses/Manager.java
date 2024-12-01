package cf.rodolfo.JavaCore.L_AbstractsClasses;

public class Manager extends Employee {

	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void bonusCalculator() {
		this.bonus = (float) (salary * 0.2);
		this.finalSalary = (float) (salary + bonus);
	}

	@Override
	public String toString() {
		return "Manager = name: " + name + " - salary: $" + salary + " - bonus: $" + bonus + " - final salary: $"
				+ finalSalary + "\n";
	}

	
}
