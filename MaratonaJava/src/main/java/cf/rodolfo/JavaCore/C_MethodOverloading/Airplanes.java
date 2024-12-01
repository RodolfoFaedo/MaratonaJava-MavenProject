package cf.rodolfo.JavaCore.C_MethodOverloading;

public class Airplanes {
	private String name;
	private String type;
	private String manufecturer;
	private int yearOfManufacture;

	public void printAirplanesReport(String name, String type, int yearOfManufacture) {
		this.name = name;
		this.type = type;
		this.yearOfManufacture = yearOfManufacture;
	}

	public void printAirplanesReport(String manufacturer, String name, String type, int yearOfManufacture) {
		this.manufecturer = manufacturer;
		this.printAirplanesReport(name, type, yearOfManufacture);
	}

	public void printAirplanesInfo() {
		System.out.printf("Manufacturer: %s%n", this.manufecturer);
		System.out.printf("Name: %s%n", this.name);
		System.out.printf("Type: %s%n", this.type);
		System.out.printf("Year of Manufacture: %d%n", this.yearOfManufacture);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getManufecturer() {
		return manufecturer;
	}

	public void setManufecturer(String manufecturer) {
		this.manufecturer = manufecturer;
	}

}
