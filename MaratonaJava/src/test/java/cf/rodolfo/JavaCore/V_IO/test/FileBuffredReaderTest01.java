package cf.rodolfo.JavaCore.V_IO.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileBuffredReaderTest01 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\rodol\\Desktop\\DevDojo\\MaratonaJava\\Files\\file_Buffered_Reader.txt");
		try {
			file.createNewFile();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		try (FileReader fileReader = new FileReader(file)) {
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
