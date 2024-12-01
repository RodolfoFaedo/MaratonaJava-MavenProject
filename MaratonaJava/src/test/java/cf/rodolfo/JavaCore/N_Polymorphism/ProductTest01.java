package cf.rodolfo.JavaCore.N_Polymorphism;

import cf.rodolfo.JavaCore.N_Polymorphism.domain.Computer;
import cf.rodolfo.JavaCore.N_Polymorphism.domain.Tomato;
import cf.rodolfo.JavaCore.N_Polymorphism.service.TaxCalculator;

public class ProductTest01 {
	public static void main(String[] args) {
		Computer computer = new Computer("Alienware", 12750);
		Tomato tomato = new Tomato("Momotaro", 32);
		TaxCalculator.taxCalculate(computer);
		System.out.println("\n");
		TaxCalculator.taxCalculate(tomato);
	}

}
