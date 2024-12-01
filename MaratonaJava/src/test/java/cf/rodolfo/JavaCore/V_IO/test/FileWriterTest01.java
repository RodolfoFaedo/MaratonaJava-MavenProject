package cf.rodolfo.JavaCore.V_IO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
	public static void main(String[] args) {
		File file02 = new File("C:\\Users\\rodol\\Desktop\\DevDojo\\MaratonaJava\\Files\\file_Writer.txt");
		try {
			file02.createNewFile();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		try (FileWriter fileWriter = new FileWriter(file02)) {
			fileWriter.write("Morbi rhoncus eu libero et interdum. Suspendisse at leo maximus, convallis erat a, eleifend nisi.\n"
							+ "Maecenas eu eros eget lacus venenatis viverra sollicitudin at felis. Vivamus et.\n");
			fileWriter.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
