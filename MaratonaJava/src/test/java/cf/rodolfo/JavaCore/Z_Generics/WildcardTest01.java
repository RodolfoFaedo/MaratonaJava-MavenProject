package cf.rodolfo.JavaCore.Z_Generics;

abstract class Animal {
	public abstract void appointment();
}

class Cat extends Animal {
	@Override
	public void appointment() {
		System.out.println("Making a cat examination");
	}
}

class Dog extends Animal {
	@Override
	public void appointment() {
		System.out.println("Making a dog examination");
	}
}

public class WildcardTest01 {
	public static void main(String[] args) {
		Dog[] dogs = {new Dog(), new Dog()};
		Cat[] cats = {new Cat(), new Cat()};
		
		printAppointment(cats);
		printAppointment(dogs);
	}
	private static void printAppointment(Animal[] animals) {
		for (Animal animal : animals) {
			animal.appointment();
		}
		
	}	
		
		
		
		
		
		
		
		
	
}
