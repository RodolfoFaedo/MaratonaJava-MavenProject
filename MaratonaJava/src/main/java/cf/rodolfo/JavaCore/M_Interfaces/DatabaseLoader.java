package cf.rodolfo.JavaCore.M_Interfaces;

public class DatabaseLoader implements DataLoader, DataRemover {

	@Override
	public void load() {
		System.out.println("Loading data from database");
	}

	@Override
	public void remove() {
		System.out.println("Removing data from database");
	}

	@Override
	public void checkPermission() {
		System.out.println("Checking permissions on database");
	}
	
	public static void retriveMaxDataSize() {
		System.out.printf("Maximum data size on database loader: %d%n", MAX_DATA_SIZE);
	}

	
}
