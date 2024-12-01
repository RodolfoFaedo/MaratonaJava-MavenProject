package cf.rodolfo.JavaCore.Z_Generics;

import cf.rodolfo.JavaCore.Z_Generics.domain.Boat;
import cf.rodolfo.JavaCore.Z_Generics.service.RentableBoatService;

public class GenericClassTest02 {
	public static void main(String[] args) {
		RentableBoatService rentableBoatService = new RentableBoatService();
		Boat boat = rentableBoatService.retriveAvailableBoat();
		System.out.println("\nUsing the boat for 1 month.....");
		rentableBoatService.returningRentalBoat(boat);
	}
}
