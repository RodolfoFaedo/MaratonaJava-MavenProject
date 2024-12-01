package cf.rodolfo.JavaCore.Y_Colections;

public class EqualsTest01 {
	public static void main(String[] args) {
		Smartphone smartphone1 = new Smartphone("1ABC1", "iPhone");
		Smartphone smartphone2 = new Smartphone("1ABC1", "iPhone");
		Smartphone smartphone3 = new Smartphone("1ABC2", "iPhone");
		Smartphone smartphone4 = new Smartphone("1ABC2", "iPhone");
		System.out.printf("The smarthone 1 is equals smartphone 2? %s%n", smartphone1.equals(smartphone2));
		System.out.printf("The smarthone 1 is equals smartphone 3? %s%n", smartphone1.equals(smartphone3));
		System.out.printf("The smarthone 3 is equals smartphone 4? %s%n", smartphone3.equals(smartphone4));

	}

}
