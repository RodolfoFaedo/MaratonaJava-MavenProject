package cf.rodolfo.JavaCore.N_Polymorphism.service;

import cf.rodolfo.JavaCore.N_Polymorphism.domain.Product;
import cf.rodolfo.JavaCore.N_Polymorphism.domain.Tomato;

public class TaxCalculator {

	public static void taxCalculate(Product product) {
		System.out.println("Tax Report");
		double tax = product.taxCalculate();
		System.out.printf("Product: %s%n", product.getName());
		System.out.printf("Price: $%.2f%n", product.getValue());
		System.out.printf("Tax to be paid: $%.2f%n", tax);
		if (product instanceof Tomato) {
			Tomato tomato = (Tomato) product;
			System.out.println(tomato.getExpirationDate());

		}

	}

}
