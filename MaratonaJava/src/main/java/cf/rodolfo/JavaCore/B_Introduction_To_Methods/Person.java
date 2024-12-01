package cf.rodolfo.JavaCore.B_Introduction_To_Methods;

public class Person {
	private String name;
	private int age;

	public void printPersonInfo() {
		System.out.printf("Name: %s%n", this.name);
		System.out.printf("Age: %d%n", this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Invalid age!");
			return;
		} else {
			this.age = age;
		}

	}

}
