package cf.rodolfo.JavaCore.C_MethodOverloading;

public class AirplanesTest01 {
	public static void main(String[] args) {
		Airplanes airplane01 = new Airplanes();
		Airplanes airplane02 = new Airplanes();
		Airplanes airplane03 = new Airplanes();
		
		airplane01.setName("Cessna Caravan");
		airplane01.setType("Freighter");
		airplane01.setYearOfManufacture(1982);
		airplane01.printAirplanesInfo();
		
		System.out.println("-----------------------------");
		
		airplane02.printAirplanesReport("A400M", "Freighter", 2003);
		airplane02.printAirplanesInfo();
		
		System.out.println("-----------------------------");
		
		airplane03.printAirplanesReport("Boeing", "B777F", "Freighter", 1990);
		airplane03.printAirplanesInfo();
	}
}
