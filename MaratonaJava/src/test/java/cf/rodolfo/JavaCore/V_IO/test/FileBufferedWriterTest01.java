package cf.rodolfo.JavaCore.V_IO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriterTest01 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\rodol\\Desktop\\DevDojo\\MaratonaJava\\Files\\file_Buffered_Writer.txt");
		try {
			file.createNewFile();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		try (FileWriter fileWriter = new FileWriter(file)) {
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Morbi rhoncus eu libero et interdum. Suspendisse at leo maximus, convallis erat a, eleifend nisi.");
			bufferedWriter.newLine();
			bufferedWriter.write("Maecenas eu eros eget lacus venenatis viverra sollicitudin at felis.");
			bufferedWriter.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
