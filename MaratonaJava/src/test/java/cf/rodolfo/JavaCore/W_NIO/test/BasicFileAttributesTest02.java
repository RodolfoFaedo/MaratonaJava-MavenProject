package cf.rodolfo.JavaCore.W_NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("Folder2/new_path.txt");
		BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
		FileTime creationTime = basicFileAttributes.creationTime();
		FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
		FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
		System.out.printf("Creation iime: %s%n", creationTime);
		System.out.printf("Last modified time: %s%n", lastModifiedTime);
		System.out.printf("Last access time: %s%n", lastAccessTime);
		
		System.out.println("");

		BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
		fileAttributeView.setTimes(lastModifiedTime, newCreationTime, lastAccessTime);
		creationTime = basicFileAttributes.creationTime();
		lastModifiedTime = basicFileAttributes.lastModifiedTime();
		lastAccessTime = basicFileAttributes.lastAccessTime();
		System.out.printf("New creation iime: %s%n", newCreationTime);
		System.out.printf("Last modified time: %s%n", lastModifiedTime);
		System.out.printf("Last access time: %s%n", lastAccessTime);

	}

}
