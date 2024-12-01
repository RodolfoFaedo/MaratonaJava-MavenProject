package cf.rodolfo.JavaCore.N_Polymorphism.service;

import cf.rodolfo.JavaCore.N_Polymorphism.repository.Repository;

public class DatabaseRepository implements Repository {

	@Override
	public void save() {
		System.out.println("Saving to database");
	}

}
