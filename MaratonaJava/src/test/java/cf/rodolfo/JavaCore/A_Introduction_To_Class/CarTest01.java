package cf.rodolfo.JavaCore.A_Introduction_To_Class;

public class CarTest01 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "Dodge";
		car1.model = "Hellcat";
		car1.yearOfRelease = 2014;
		
		Car car2 = new Car();
		car2.brand = "Mitsubishi";
		car2.model = "L200 Triton";
		car2.yearOfRelease = 1978;
		
		System.out.println("----------Car1----------");
		System.out.printf("Brand: %s%n", car1.brand);
		System.out.printf("Model: %s%n", car1.model);
		System.out.printf("Year of Release: %d%n", car1.yearOfRelease);
		
		System.out.println("\n----------Car2----------");
		System.out.printf("Brand: %s%n", car2.brand);
		System.out.printf("Model: %s%n", car2.model);;
		System.out.printf("Year of Release: %d%n", car2.yearOfRelease);
		
		
	}

}
