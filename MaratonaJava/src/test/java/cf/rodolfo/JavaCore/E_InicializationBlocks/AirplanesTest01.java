package cf.rodolfo.JavaCore.E_InicializationBlocks;

public class AirplanesTest01 {
	public static void main(String[] args) {
		Airplanes airplane = new Airplanes("B777");
		for (int tyres : airplane.getTyres()) {
			System.out.printf("%d ", tyres);
		}

	}
}
