package cf.rodolfo.JavaCore.O_Exception.execption;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {
	public static void main(String[] args) {
		readFile();
	}

	public static void readFile() {
		// could be write without "catch" or "finally
		try (Reader1 reader1 = new Reader1(); Reader2 reader2 = new Reader2()) {

		} catch (IOException e) {

		}
	}

	public static void readFile2() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("test.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
