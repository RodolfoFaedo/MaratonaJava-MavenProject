package cf.rodolfo.JavaCore.L_AbstractsClasses;

public class Developer extends Employee {

	public Developer(String name, double salary) {
		super(name, salary);

	}

	@Override
	public void bonusCalculator() {
		this.bonus = (float) (salary * 0.05);
		this.finalSalary = (float) (salary + bonus);
	}

	@Override
	public String toString() {
		return "Developer = name: " + name + " - salary: $" + salary + " - bonus: $" + bonus + " - final salary: $"
				+ finalSalary + "\n";
	}

	

}
