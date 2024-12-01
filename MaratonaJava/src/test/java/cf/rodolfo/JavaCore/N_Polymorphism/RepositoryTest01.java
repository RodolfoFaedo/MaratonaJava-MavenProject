package cf.rodolfo.JavaCore.N_Polymorphism;

import cf.rodolfo.JavaCore.N_Polymorphism.repository.Repository;
import cf.rodolfo.JavaCore.N_Polymorphism.service.DatabaseRepository;
import cf.rodolfo.JavaCore.N_Polymorphism.service.FileRepository;
import cf.rodolfo.JavaCore.N_Polymorphism.service.MemoryRepository;

public class RepositoryTest01 {
	public static void main(String[] args) {
		Repository repository = new DatabaseRepository();
		Repository repository2 = new MemoryRepository();
		Repository repository3 = new FileRepository();
		repository.save();
		repository2.save();
		repository3.save();
	
	}	
	

}
