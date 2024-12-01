package cf.rodolfo.JavaCore.D_Constructors;

public class AirplanesTest01 {
	public static void main(String[] args) {

		Airplanes airplane01 = new Airplanes("ATR72", "Avions de Transport Régional", "PAX", 1988);
		Airplanes airplane02 = new Airplanes("E192", "Embraer", "PAX", 2002, 124);

		airplane01.printAirplanesInfo();

		System.out.println("--------------------------------------");

		airplane02.printAirplanesInfo();

		System.out.println("--------------------------------------");
	}
}
