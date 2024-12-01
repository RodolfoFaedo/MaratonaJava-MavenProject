package cf.rodolfo.JavaCore.Z_Generics.service;

import java.util.ArrayList;
import java.util.List;

import cf.rodolfo.JavaCore.Z_Generics.domain.Car;

public class RentableCarService {
	List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));

	public Car retriveAvailableCar() {
		System.out.println("\nSearching available cars... ...");
		Car car = availableCars.remove(0);
		System.out.println("______________________________________________");
		System.out.printf("%nRenting car: %s%n", car);
		System.out.println("______________________________________________");
		System.out.printf("\nAvailable cars to rent: %s%n",availableCars );
		System.out.println("______________________________________________");
		return car;
	}

	public void returningRentalCar(Car car) {
		System.out.printf("%nReturning car: %s%n", car);
		availableCars.add(car);
		System.out.println("______________________________________________");
		System.out.printf("\nAvailable cars to rent: %s%n%n",availableCars);
		
		
	}
}
