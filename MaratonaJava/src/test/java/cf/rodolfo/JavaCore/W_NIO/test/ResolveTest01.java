package cf.rodolfo.JavaCore.W_NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
	public static void main(String[] args) {
		Path dir = Paths.get("Folder2/sub_Folder2");
		Path file = Paths.get("sub_sub_Folder2/file.txt");
		Path resolvedPath = dir.resolve(file);
		System.out.println(resolvedPath);

		Path absolutePath = Paths.get("/home/users");
		Path relativePath = Paths.get("rodol");
		Path file2 = Paths.get("file.jar");
		Path resolvedPath2 = absolutePath.resolve(relativePath);
		System.out.println("1: " + absolutePath.resolve(resolvedPath2));
		System.out.println("2: " + absolutePath.resolve(file2));
		System.out.println("3: " + relativePath.resolve(absolutePath));
		System.out.println("4: " + relativePath.resolve(file2));
		System.out.println("5: " + file2.resolve(absolutePath));
		System.out.println("6: " + file2.resolve(relativePath));

	}

}
