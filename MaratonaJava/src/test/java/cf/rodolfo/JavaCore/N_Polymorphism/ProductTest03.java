package cf.rodolfo.JavaCore.N_Polymorphism;

import cf.rodolfo.JavaCore.N_Polymorphism.domain.Computer;
import cf.rodolfo.JavaCore.N_Polymorphism.domain.Product;
import cf.rodolfo.JavaCore.N_Polymorphism.domain.Tomato;
import cf.rodolfo.JavaCore.N_Polymorphism.service.TaxCalculator;

public class ProductTest03 {
	public static void main(String[] args) {
		Product product01 = new Computer("Ryzen 9", 3000);
		Tomato tomato = new Tomato("Italian", 15);
		tomato.setExpirationDate("20/10/2024");
		TaxCalculator.taxCalculate(tomato);
		System.out.println("\n--------------------------------------\n");
		TaxCalculator.taxCalculate(product01);
		

	}

}
