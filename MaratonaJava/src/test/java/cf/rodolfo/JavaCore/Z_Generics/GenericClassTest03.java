package cf.rodolfo.JavaCore.Z_Generics;

import java.util.ArrayList;
import java.util.List;

import cf.rodolfo.JavaCore.Z_Generics.domain.Boat;
import cf.rodolfo.JavaCore.Z_Generics.domain.Car;
import cf.rodolfo.JavaCore.Z_Generics.service.RentalService;

public class GenericClassTest03 {
	public static void main(String[] args) {
		List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));
		List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Yacht")));

		RentalService<Car> rentalService = new RentalService<>(availableCars);
		Car car = rentalService.retriveAvailableObject();
		System.out.println("\nUsing the boat for 1 month.....");
		rentalService.returningRentalObject(car);

		System.out.println("\n********************************************\n");

		RentalService<Boat> rentalService2 = new RentalService<>(availableBoats);
		Boat boat = rentalService2.retriveAvailableObject();
		System.out.println("\nUsing the boat for 1 month.....");
		rentalService2.returningRentalObject(boat);
	}
}
