package cf.rodolfo.JavaCore.H_Heritage;

import cf.rodolfo.JavaCore.G_Association.Employee;
import cf.rodolfo.JavaCore.G_Association.Person;

public class HeritageTest01 {
	public static void main(String[] args) {
		Address address01 = new Address();
		Address address02 = new Address();
		address01.setStreet("Groove Street");
		address01.setCep("012345-209");
		address02.setStreet("Jackson Ranch Street");
		address02.setCep("987.654-32");

		Person person = new Person("Abby");
		person.setCpf("111.111.111-11");
		person.setAddress(address01);

		person.printInfo();

		System.out.println("\n*********************************\n");

		Employee employee = new Employee("Joel");
		employee.setCpf("999.999.999-72");
		employee.setAddress(address02);
		employee.setSalary(20000);

		employee.printInfo();
		employee.paymentReport();
	}

}
