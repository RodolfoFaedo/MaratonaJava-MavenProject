package cf.rodolfo.JavaCore.O_Exception.execption;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
	public static void main(String[] args) throws IOException {
		createNewFile();

	}

	public static void createNewFile() throws IOException {
		File file = new File("Files/test.txt");
		try {
			boolean isCreated = file.createNewFile();
			System.out.printf("File was created? %s%n", isCreated);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("\n");
			throw e;
		}

	}
}
