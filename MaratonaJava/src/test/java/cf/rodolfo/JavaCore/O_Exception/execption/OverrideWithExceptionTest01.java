package cf.rodolfo.JavaCore.O_Exception.execption;


import java.io.FileNotFoundException;

public class OverrideWithExceptionTest01 {
	public static void main(String[] args) {
		Person person = new Person();
		Employee employee = new Employee();
		
		employee.save();
		try {
			person.save();
		} catch (FileNotFoundException | InvalidLoginException e) {
			e.printStackTrace();
		}
	}

}
