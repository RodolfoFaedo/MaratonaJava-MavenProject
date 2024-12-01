package cf.rodolfo.JavaCore.W_NIO.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
	public static void main(String[] args) throws IOException {
		LocalDateTime date = LocalDateTime.now().minusDays(10);
		File file = new File("Folder2/new.txt");
		file.createNewFile();
		file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

		Path path = Paths.get("Folder2/new_path.txt");
		Files.createFile(path);
		FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
		Files.setLastModifiedTime(path, fileTime);

	}

}
