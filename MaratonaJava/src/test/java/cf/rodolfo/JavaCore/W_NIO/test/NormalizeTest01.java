package cf.rodolfo.JavaCore.W_NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
	public static void main(String[] args) {
		String projectDirectory = "/MaratonaJava/C/Users/rodol";
		String fileTxt = "../../file.txt";
		Path path1 = Paths.get(projectDirectory, fileTxt);
		System.out.printf("Unnormalized Path: %s%n", path1);
		System.out.printf("Normalized Path: %s%n", path1.normalize());
	}
}
