package cf.rodolfo.JavaCore.X_Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1528297742512182686L;
	private Long id;
	private String name;
	private transient String password;
	private transient Grade grade;

	public Student(Long id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	private void writeObject(ObjectOutputStream objectOutputStream) {
		try {
			objectOutputStream.defaultWriteObject();
			objectOutputStream.writeUTF(grade.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream objectInputStream) {
		try {
			objectInputStream.defaultReadObject();
			String gradeName = objectInputStream.readUTF();
			grade = new Grade(gradeName);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + "," + " grade=" + grade + "]";
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
