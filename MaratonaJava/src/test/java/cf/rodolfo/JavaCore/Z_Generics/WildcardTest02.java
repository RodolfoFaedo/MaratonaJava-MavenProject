package cf.rodolfo.JavaCore.Z_Generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
	public static void main(String[] args) {
		List<Dog> dogs = List.of(new Dog(), new Dog());
		List<Cat> cats = List.of(new Cat(), new Cat());
		printAppointment(dogs);
		printAppointment(cats);
		List<Animal> animals = new ArrayList<>();
		printAnimalAppointment(animals);
		

	}

	private static void printAppointment(List<? extends Animal> animals) {
		for (Animal animal : animals) {
			animal.appointment();
		}
	}

	private static void printAnimalAppointment(List<? super Animal> animals) {
		Animal animal = new Dog();
		Animal animal2 = new Cat();
		animals.add(animal);
		animals.add(animal2);
		
	}

}
