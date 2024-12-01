package cf.rodolfo.JavaCore.D_Constructors;

public class Airplanes {
	private String name;
	private String type;
	private String manufecturer;
	private int yearOfManufacture;
	private int maxNumberOfSeats;

	public Airplanes() {
	}

	public Airplanes(String name, String manufecturer, String type, int yearOfManufacture) {
		this();
		this.name = name;
		this.type = type;
		this.manufecturer = manufecturer;
		this.yearOfManufacture = yearOfManufacture;
	}

	public Airplanes(String name, String manufecturer, String type, int yearOfManufacture, int maxNumberOfSeats ) {
		this(name, manufecturer, type, yearOfManufacture);
		this.maxNumberOfSeats = maxNumberOfSeats;
	}

	public void printAirplanesInfo() {
		System.out.printf("Name: %s%n", this.name);
		System.out.printf("Manufacturer: %s%n", this.manufecturer);
		System.out.printf("Type: %s%n", this.type);
		System.out.printf("Year of Manufacture: %d%n", this.yearOfManufacture);
		System.out.printf("Maximum Number of Seats: %d%n", this.maxNumberOfSeats);
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

	public int getQuantityProduced() {
		return maxNumberOfSeats;
	}

	public void setQuantityProduced(int quantityProduced) {
		this.maxNumberOfSeats = quantityProduced;
	}

}
