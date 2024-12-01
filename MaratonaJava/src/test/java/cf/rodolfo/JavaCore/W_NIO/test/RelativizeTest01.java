package cf.rodolfo.JavaCore.W_NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
	public static void main(String[] args) {
		Path dir = Paths.get("/C/users");
		Path clazz = Paths.get("/C/users/maratonajava/OlaMundo.java");
		Path pathToClazz = dir.relativize(clazz);
		System.out.println(pathToClazz);
		
		System.out.println("");
		
		Path absolute1 = Paths.get("/C/users");
		Path absolute2 = Paths.get("/maratonaJava/OlaMundo.java");
		Path absolute3 = Paths.get("/C/users/maratonajava/OlaMundo.java");
		Path relative1 = Paths.get("temp");
		Path relative2 = Paths.get("temp/temp20241115");
		
		System.out.println("1 = " + absolute1.relativize(absolute3));
		System.out.println("2 = " + absolute3.relativize(absolute1));
		System.out.println("3 = " + absolute1.relativize(absolute2));
		System.out.println("4 = " + relative1.relativize(relative2));
		System.out.println("5 = " + absolute1.relativize(relative1));
		
	}
}
