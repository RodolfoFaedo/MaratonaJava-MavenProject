package cf.rodolfo.JavaCore.F_StaticModifier;

public class Car {
	private String brandModel;
	private double maxSpeed;
	public static double speedLimit = 250;
	
	
	
	public Car(String brandModel, double maxSpeed) {
		this.brandModel = brandModel;
		this.maxSpeed = maxSpeed;
		
	}

	public void printInfo() {
		System.out.printf("%nBrand Model: %s%n", this.brandModel);
		System.out.printf("Maximum Speed: %.1f km/h%n", this.maxSpeed);
		System.out.printf("Speed Limit: %.1f km/h%n", speedLimit);
		//System.out.println("-------------------------------------");
	}

	public String getBrandModel() {
		return brandModel;
	}

	public void setBrandModel(String brandModel) {
		this.brandModel = brandModel;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	
	

}
