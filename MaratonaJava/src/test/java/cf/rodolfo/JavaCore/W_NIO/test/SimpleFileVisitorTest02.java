package cf.rodolfo.JavaCore.W_NIO.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		System.out.println(file.getFileName());
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.out.printf("Pre visit on %s%n", dir.getFileName());
		return FileVisitResult.CONTINUE;

	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		return super.visitFileFailed(file, exc);
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.printf("Post visit on %s%n", dir.getFileName());
		return FileVisitResult.CONTINUE;
	}

}

public class SimpleFileVisitorTest02 {
	public static void main(String[] args) throws IOException {
		Path root = Paths.get("Folder");
		Files.walkFileTree(root, new ListAllFiles());
	}
}
