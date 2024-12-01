package cf.rodolfo.JavaCore.V_IO.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\rodol\\Desktop\\DevDojo\\MaratonaJava\\Files\\file_Reader.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (FileReader fileReader = new FileReader(file)) {
//			char[] input = new char[];
//			int i = fileReader.read(input);
//			for (char c : input) {
//				System.out.print(c);
//			}
			int input;
			while ((input = fileReader.read()) != -1) {
				System.out.print((char) input);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
