package cf.rodolfo.JavaCore.B_Introduction_To_Methods;

public class Worker {
	private String name;
	private int age;
	private double[] salary;
	private double averageSalary = 0;

	public void printInfo() {
		System.out.printf("Name: %s%n", this.name);
		System.out.printf("Age: %d%n", this.age);
		for (double s : salary) {
			System.out.printf("Salary: $%s%n", s);
		}
	}

	public void averageSalary() {	
		for (double s : salary) {
			averageSalary += s;
		}
		averageSalary /= salary.length;
		System.out.printf("Average Salary: $%.1f%n", averageSalary);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double[] getSalary() {
		return salary;
	}

	public void setSalary(double[] salary) {
		this.salary = salary;
	}

	public double getAverageSalary() {
		return averageSalary;
	}

}
