package cf.rodolfo.JavaCore.E_InicializationBlocks;

public class Airplanes {
	private String name;
	private int[] tyres;
	/*
	 	1 = memory space is allocated for the object;
	 	2 = each class attribute is created and inicialized with default values or whatever is passed;
	 	3 = the inicialization block is executed;
	 	4 = the constructor is executed;
	 */

	{
		System.out.printf("Inside of inicialization block%n");
		tyres = new int[14];
		for (int i = 0; i < tyres.length; i++) {
			tyres[i] = i + 1;
		}
	}

	public Airplanes(String name) {
		super();
		this.name = name;
	}

	public Airplanes() {
		
		for (int e : this.tyres) {
			System.out.printf("%d ", e);
		}

	}

	public String getName() {
		return name;
	}

	public int[] getTyres() {
		return tyres;
	}

}
