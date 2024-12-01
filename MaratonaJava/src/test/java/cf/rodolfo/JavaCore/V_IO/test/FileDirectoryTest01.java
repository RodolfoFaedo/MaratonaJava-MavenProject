package cf.rodolfo.JavaCore.V_IO.test;

import java.io.File;
import java.io.IOException;

public class FileDirectoryTest01 {
	public static void main(String[] args) throws IOException {
		File directory = new File("Folder");
		boolean isDirectoryCreated = directory.mkdir();
		System.out.printf("The directory was created? %s%n", isDirectoryCreated);

		File file = new File(directory, "file01.txt");
		boolean isFileCreated = file.createNewFile();
		System.out.printf("The file was created? %s%n", isFileCreated);

		File fileToBeRenamed = new File(directory, "file02.txt");
		boolean isFileToBeRenamedCreated = fileToBeRenamed.createNewFile();
		System.out.printf("The file to be renamed was created? %s%n", isFileToBeRenamedCreated);

		File renamedFile = new File(directory, "renamedFile01.txt");
		boolean isFileRenamed = fileToBeRenamed.renameTo(renamedFile);
		System.out.printf("The file was renamed? %s%n", isFileRenamed);
	}
}
