package cf.rodolfo.JavaCore.N_Polymorphism;

import cf.rodolfo.JavaCore.N_Polymorphism.domain.Computer;
import cf.rodolfo.JavaCore.N_Polymorphism.domain.Product;
import cf.rodolfo.JavaCore.N_Polymorphism.domain.Tomato;

public class ProductTest02 {
	public static void main(String[] args) {
		
		Product product01 = new Computer("Ryzen 9", 3000);
		System.out.println(product01.getName());
		System.out.println(product01.getValue());
		System.out.println(product01.taxCalculate());
		
		System.out.println("----------------");
		
		Product product02 = new Tomato("Italian", 15);
		System.out.println(product02.getName());
		System.out.println(product02.getValue());
		System.out.println(product02.taxCalculate());
		
		
	}

}
