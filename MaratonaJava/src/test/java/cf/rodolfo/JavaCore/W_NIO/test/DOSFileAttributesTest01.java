package cf.rodolfo.JavaCore.W_NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DOSFileAttributesTest01 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("Folder2/dos_file.txt");
		if(Files.notExists(path)) {
			Files.createFile(path);
		}
		Files.setAttribute(path, "dos:hidden", true);
		Files.setAttribute(path, "dos:readonly", true);
		DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
		System.out.printf("Is read only? %s%n", dosFileAttributes.isReadOnly());
		System.out.printf("Is hidden? %s%n", dosFileAttributes.isHidden());
		
		System.out.println("");
		
		DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
		fileAttributeView.setArchive(false);
		fileAttributeView.setHidden(false);
		fileAttributeView.setReadOnly(false);
		System.out.printf("Is archive? %s%n", fileAttributeView.readAttributes().isArchive());
		System.out.printf("Is hidden? %s%n", fileAttributeView.readAttributes().isHidden());
		System.out.printf("Is read only? %s%n", fileAttributeView.readAttributes().isReadOnly());
		fileAttributeView.setArchive(true);
		fileAttributeView.setHidden(true);
		fileAttributeView.setReadOnly(true);
		System.out.printf("Is archive? %s%n", fileAttributeView.readAttributes().isArchive());
		System.out.printf("Is hidden? %s%n", fileAttributeView.readAttributes().isHidden());
		System.out.printf("Is read only? %s%n", fileAttributeView.readAttributes().isReadOnly());
	}

}
