package cf.rodolfo.JavaCore.Z_Generics.service;

import java.util.ArrayList;
import java.util.List;

import cf.rodolfo.JavaCore.Z_Generics.domain.Boat;

public class RentableBoatService {
	List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Yacht")));

	public Boat retriveAvailableBoat() {
		System.out.println("\nSearching available boat... ...");
		Boat boat = availableBoats.remove(0);
		System.out.println("______________________________________________");
		System.out.printf("%nRenting boat: %s%n", boat);
		System.out.println("______________________________________________");
		System.out.printf("\nAvailable boats to rent: %s%n", availableBoats);
		System.out.println("______________________________________________");
		return boat;
	}

	public void returningRentalBoat(Boat boat) {
		System.out.printf("%nReturning car: %s%n", boat);
		availableBoats.add(boat);
		System.out.println("______________________________________________");
		System.out.printf("\nAvailable boats to rent: %s%n", availableBoats);

	}
}
