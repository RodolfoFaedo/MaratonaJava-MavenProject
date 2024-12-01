package cf.rodolfo.JavaCore.F_StaticModifier;

public class CarTest01 {
	public static void main(String[] args) {
		Car car01 = new Car("BMW X3", 210);
		Car car02 = new Car("Mercedes EQS Sedan", 220);
		Car car03 = new Car("Audi SQ8 Sportback e-tron", 210);
		car01.printInfo();
		car02.printInfo();
		car03.printInfo();
		
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("Changing Speed Limit to 180 km/h");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		Car.speedLimit = 180;
		
		car01.printInfo();
		car02.printInfo();
		car03.printInfo();
	}

}
