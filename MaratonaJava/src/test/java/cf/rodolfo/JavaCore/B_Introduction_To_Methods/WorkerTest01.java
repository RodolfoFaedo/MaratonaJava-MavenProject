package cf.rodolfo.JavaCore.B_Introduction_To_Methods;

public class WorkerTest01 {
	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.setName("Argo");
		worker.setAge(67);
		worker.setSalary(new double[] { 2752, 3258, 4500 });
		worker.printInfo();
		worker.averageSalary();
		System.out.printf("Average Salary: $%.1f%n", worker.getAverageSalary());
	}

}
