package cf.rodolfo.JavaCore.V_IO.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\rodol\\Desktop\\DevDojo\\MaratonaJava\\Files\\file.txt");
		try {
			boolean isCreated = file.createNewFile();
			System.out.printf("The file was created: %s%n", isCreated);

			String path = file.getPath();
			System.out.printf("File path: %s%n", path);

			String absolutePath = file.getAbsolutePath();
			System.out.printf("File absolute path: %s%n", absolutePath);

			boolean isDirectory = file.isDirectory();
			System.out.printf("Is a directory? %s%n", isDirectory);

			boolean isFile = file.isFile();
			System.out.printf("Is a file? %s%n", isFile);

			boolean isHidden = file.isHidden();
			System.out.printf("The file is hidden? %s%n", isHidden);

			boolean isReadable = file.canRead();
			System.out.printf("The file is readable? %s%n", isReadable);

			long lastModified = file.lastModified();
			System.out.printf("Last modification: %s%n", Instant.ofEpochMilli(lastModified).atZone(ZoneId.systemDefault())
							.toLocalDateTime());

			boolean exists = file.exists();
			if (exists) {
				//boolean isDeleted = file.delete();
				//System.out.printf("The file was deleted: %s%n", isDeleted);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
