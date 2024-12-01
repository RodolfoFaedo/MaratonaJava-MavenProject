package cf.rodolfo.JavaCore.O_Exception.execption;

import java.io.FileNotFoundException;

public class Person {
	public void save() throws InvalidLoginException, FileNotFoundException {
		System.out.println("Saving person");
	}

}
