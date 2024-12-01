package cf.rodolfo.JavaCore.Z_Generics.service;

import java.util.List;

public class RentalService<T> {
	private List<T> availableObjects;

	public RentalService(List<T> availableObjects) {
		super();
		this.availableObjects = availableObjects;
	}

	public T retriveAvailableObject() {
		System.out.println("\nSearching available objects... ...");
		T t = availableObjects.remove(0);
		System.out.println("______________________________________________");
		System.out.printf("%nRenting object: %s%n", t);
		System.out.println("______________________________________________");
		System.out.printf("\nAvailable objects to rent: %s%n", availableObjects);
		System.out.println("______________________________________________");
		return t;
	}

	public void returningRentalObject(T t) {
		System.out.printf("%nReturning object: %s%n", t);
		availableObjects.add(t);
		System.out.println("______________________________________________");
		System.out.printf("\nAvailable objects to rent: %s%n%n", availableObjects);

	}

}
