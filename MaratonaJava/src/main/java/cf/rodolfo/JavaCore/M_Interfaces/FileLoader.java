package cf.rodolfo.JavaCore.M_Interfaces;

public class FileLoader implements DataLoader, DataRemover {

	@Override
	public void load() {
		System.out.println("Loading data from a file");
	}

	@Override
	public void remove() {
		System.out.println("Removing data from a file");
	}

	@Override
	public void checkPermission() {
		System.out.println("Checking permissions on file");
	}
	
	
	

}
