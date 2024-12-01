package cf.rodolfo.JavaCore.Z_Generics;

import cf.rodolfo.JavaCore.Z_Generics.domain.Boat;
import cf.rodolfo.JavaCore.Z_Generics.domain.Car;
import cf.rodolfo.JavaCore.Z_Generics.service.RentableBoatService;
import cf.rodolfo.JavaCore.Z_Generics.service.RentableCarService;

public class GenericClassTest01 {
	public static void main(String[] args) {
		RentableCarService rentableCarService = new RentableCarService();
		Car car = rentableCarService.retriveAvailableCar();
		System.out.println("\nUsing the car for 1 month.....");
		rentableCarService.returningRentalCar(car);
		
		RentableBoatService rentableBoatService = new RentableBoatService();
		Boat boat = rentableBoatService.retriveAvailableBoat();
		System.out.println("\nUsing the boat for 1 month.....");
		rentableBoatService.returningRentalBoat(boat);
	}
}
