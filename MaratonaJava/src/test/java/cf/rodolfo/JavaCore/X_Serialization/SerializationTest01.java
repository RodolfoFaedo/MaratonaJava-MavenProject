package cf.rodolfo.JavaCore.X_Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Student student = new Student(1L, "Rodolfo Faedo", "123412121");
		Grade grade = new Grade("Maratona Java");
		student.setGrade(grade);
		toSerializate(student);
		toUnserializate();

	}

	
	@SuppressWarnings("unused")
	private static void toSerializate(Student student) {
		Path path = Paths.get("Folder/student_ser.txt");
		try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
			outputStream.writeObject(student);
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void toUnserializate() {
		Path path = Paths.get("Folder/student_ser.txt");
		try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))) {
			Student student = (Student) objectInputStream.readObject();
			System.out.println(student);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
