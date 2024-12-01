package cf.rodolfo.JavaCore.W_NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		Path folderPath = Paths.get("Folder2");
		if (Files.notExists(folderPath)) {
			Path folderDirectory = Files.createDirectory(folderPath);
		}
		Path subFolderPath = Paths.get("Folder2/sub_Folder2/sub_sub_Folder2/");
		if (Files.notExists(subFolderPath)) {
			Path subFolderDirectory = Files.createDirectories(subFolderPath);
		}
		Path directories = Files.createDirectories(subFolderPath);
		Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
		if (Files.notExists(filePath)) {
			Path filePathCreate = Files.createFile(filePath);
		}
		
		Path source = filePath;
		Path target = Paths.get(filePath.getParent().toString(), "renamed_file.txt");
		Files.copy(source, target);
	}
	
}
